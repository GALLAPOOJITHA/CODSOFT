package firstclass;
import java.util.Scanner;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.io.InputStreamReader;
import java.net.URL; 

	   public class task4 {

	                public static void main(String[] args) {
	                    Scanner sc = new Scanner(System.in);

	                    try {
	                        System.out.print("Enter base Currency (e.g. USD): ");
	                        String base = sc.nextLine().toUpperCase();

	                        System.out.print("Enter target currency (e.g. INR): ");
	                        String target = sc.nextLine().toUpperCase();

	                        System.out.print("Enter amount: ");
	                        double amount = sc.nextDouble();

	                       
	                        String urlStr = "https://api.exchangerate.host/latest?base=5ce30a8319bc401bb2fd354ba2b0c8c7" + base + "&symbols=" + target;
	                        URL url = new URL(urlStr);
	                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	                        conn.setRequestMethod("GET");

	                        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	                        StringBuilder json = new StringBuilder();
	                        String line;
	                        while ((line = reader.readLine()) != null) 
	                        {
	                            json.append(line);
	                        }
	                        reader.close();

	                        String search = "\"" + target + "\":";
	                        int index = json.indexOf(search);
	                        if (index == -1) {
	                            System.out.println("Rate is  not found.");
	                            return;
	                        }

	                        int start = index + search.length();
	                        int end = json.indexOf("}", start);
	                        double rate = Double.parseDouble(json.substring(start, end).trim());

	                        double converted = amount * rate;
	                        System.out.printf("%.2f %s is equal to %.2f %s\n", amount, base, converted, target);

	                    } catch (Exception e) {
	                        System.out.println("Error: " + e.getMessage());
	                    }

	                    sc.close(); 
	                }
	            }


