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


	public class CoordinatesCode {
		
		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the value of x coordinate - ");
			int x1 = in.nextInt();
			System.out.print("Enter the value of y coordinate - ");
			int y1 = in.nextInt();

			String coordinates = null;
			BufferedReader bufferedReader = null;
			String fileName = "coords.txt";
			try {
				
				FileReader fileReader = new FileReader(fileName);
				bufferedReader = new BufferedReader(fileReader);

				Map<Double, List<Integer>> treeMap = new TreeMap<Double, List<Integer>>();

				while ((coordinates = bufferedReader.readLine()) != null) 
				{

					String[] cood = coordinates.split(",");

					int x2 = Integer.parseInt(cood[1]);
					int y2 = Integer.parseInt(cood[2]);

					List<Integer> closeCoords = new ArrayList<Integer>();

					double distance = distance(x1, x2, y1, y2);
						closeCoords.add(x2);
						closeCoords.add(y2);
						treeMap.put(distance, closeCoords);
						
				}

				for (Double d : treeMap.keySet()) {
					List<Integer> coords = treeMap.get(d);
					System.out.println("Closest Coordinates: ("+coords.get(0)+","+coords.get(1)+")");
					
				}

			} catch (FileNotFoundException ex) {
				System.out.println("Unable to open file '" + fileName + "'");
			} catch (IOException ex) {
				System.out.println("Error reading file '" + fileName + "'");
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
		
		public static double distance(int x1, int x2, int y1, int y2) {
			double x = Math.pow((x2-x1), 2);
			double y = Math.pow((y2-y1), 2);
			double dis = Math.sqrt(x + y);
			return dis;
		}



		}





