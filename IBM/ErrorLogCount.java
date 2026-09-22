public class ErrorLogCount {

    public static int countThreeConsecutiveErrors(String[] logs) {
        int consecutive = 0;
        int count = 0;

        for (String log : logs) {
            if (log.toLowerCase().contains("error")) {
                consecutive++;

                if (consecutive == 3) {
                    count++;
                    consecutive = 0; 
                }
            } else {
                consecutive = 0;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String[] logs = {
                "serverA success",
                "serverA error",
                "serverB error",
                "serverC error",
                "serverA success",
                "serverB error",
                "serverC error",
                "serverD error"
        };

        System.out.println("Count = " + countThreeConsecutiveErrors(logs));
    }
}