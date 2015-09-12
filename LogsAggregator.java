import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Andriano on 12.9.2015 ã..
 * Write a program to aggregate the logs data and print for each user the total duration
 * of his sessions and a list of unique IP addresses in format "<user>: <duration> [<IP1>, <IP2>, …]".
 * Order the users alphabetically. Order the IPs alphabetically.
 * In our example, the output should be the following:
 */
public class LogsAggregator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, Integer>> userByIpAndDuration = new TreeMap<>();

        String[] input;

        for (int i = 0; i < n; i++) {
            input  = scanner.nextLine().split(" ");
            String ip = input[0];
            String user = input[1];
            int duration = Integer.parseInt(input[2]);
            if (!userByIpAndDuration.containsKey(user)){
                userByIpAndDuration.put(user, new TreeMap<>());

                Integer value = userByIpAndDuration.get(user).get(ip);

                if (value == null){
                    value = 0;
                }
                userByIpAndDuration.get(user).put(ip, value + duration);
            }else {
                Integer value = userByIpAndDuration.get(user).get(ip);
                if (value == null){
                    value=0;
                }
                userByIpAndDuration.get(user).put(ip, value + duration);
            }
        }
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : userByIpAndDuration.entrySet()) {
            String user = stringMapEntry.getKey();

            Map<String, Integer> value = stringMapEntry.getValue();

            ArrayList<String> ipAddresses = new ArrayList<>();

            int totalDuration = 0;

            for (Map.Entry<String, Integer> stringIntegerEntry : value.entrySet()) {
                ipAddresses.add(stringIntegerEntry.getKey());
                totalDuration+=stringIntegerEntry.getValue();
            }
            System.out.println(user + ": " + totalDuration + " " + ipAddresses);
        }
    }
}
