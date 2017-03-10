package yelp.Slack;


	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Map;
	import java.util.Scanner;
	import java.util.TreeMap;
	
	public class Comcast {

			public static double dis(int a1, int a2, int b1, int b2) {
			double distance = Math.sqrt(((a2 - a1) * (a2 - a1)) + ((b2 - b1) * (b2 - b1)));
			return distance;
		}

		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);

			System.out.print("Enter the value of a: ");
			int a1 = in.nextInt();
			System.out.print("Enter the value of b: ");
			int b1 = in.nextInt();

			String line = null;
			BufferedReader bufferedReader = null;
			String Name = null;
			System.out.print("Enter the value of name: ");
			try {
				Name = System.getProperty("user.dir") +"\\" + in.next();

				FileReader fileReader = new FileReader(Name);
				bufferedReader = new BufferedReader(fileReader);

				Map<Double, List<Integer>> map = new TreeMap<Double, List<Integer>>();

				while ((line = bufferedReader.readLine()) != null) {

					String[] array = line.split(",");

					int a2 = Integer.parseInt(array[1]);
					int b2 = Integer.parseInt(array[2]);

					List<Integer> result = new ArrayList<Integer>();

					double dis = dis(a1, a2, b1, b2);
					if (map.containsKey(dis)) {
						// if two cordinates are same in text file
						result = map.get(dis);
						result.add(a2);
						result.add(b2);
						map.put(dis, result);
					} else {
						result.add(a2);
						result.add(b2);
						map.put(dis, result);
					}

				}

				for (Double d : map.keySet()) {
					List<Integer> coords = map.get(d);
					System.out.print("Distance: " + d + " - coordinates: (");
					for (int i = 0; i < coords.size(); i++) {
						System.out.print(coords.get(i));
						if (i == coords.size() - 1) {
							System.out.print(")");
						} else {
							System.out.print(",");
						}
					}
					System.out.println();
				}

			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + Name + "'");
			} catch (IOException ex) {
				System.out.println("Error reading file '" + Name + "'");
			}catch (Exception ex) {
				System.out.println("Error in program");
				ex.printStackTrace();
			} finally {
				try {
					if(null!=bufferedReader)
					bufferedReader.close();
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}


