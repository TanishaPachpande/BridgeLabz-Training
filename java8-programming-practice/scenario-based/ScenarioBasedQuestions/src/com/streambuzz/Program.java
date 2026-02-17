package com.streambuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {
	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		CreatorStats creator = null;

		while (true) {

			System.out.println("1. Register Creator");
			System.out.println("2. Show Top Posts");
			System.out.println("3. Calculate Average Likes");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:

				sc.nextLine(); 
			    System.out.println("Enter Creator Name:");
			    String creatorName = sc.nextLine();
				System.out.println("Enter weekly likes (Week 1 to 4):");
				double[] weeklyLikes = new double[4];
				for (int i = 0; i < 4; i++) {
					weeklyLikes[i] = sc.nextDouble();
				}
				creator = new CreatorStats(creatorName, weeklyLikes);
				registerCreator(creator);
				break;
			case 2:
				System.out.println("Enter like threshold:");
				double likeThreshold = sc.nextDouble();
				Map<String, Integer> topPosts = getTopPostCounts(EngagementBoard, likeThreshold);
				if (topPosts == null) {
					System.out.println("No top-performing posts this week");
				} else {
					for (String key : topPosts.keySet()) {
						System.out.println(key + " - " + topPosts.get(key));
					}
				}
				break;
			case 3:
				System.out.println("Overall average weekly likes: " + calculateAverageLikes());
				break;
			case 4:
				System.out.println("Logging off - Keep Creating with StreamBuzz!");
				return;
			default:
				System.out.println("Invalid choice");
			}
		}
	}

	public static List<CreatorStats> EngagementBoard = new ArrayList<>();;

	public static void registerCreator(CreatorStats record) {
		EngagementBoard.add(record);
		System.out.println("Creator registered successfully");
		count++;
	}

	public static Map<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold) {
		
		Map<String, Integer> postResults = new TreeMap<>();
		for (CreatorStats i : records) {
			int count = 0;
			double[] likes = i.weeklyLikes;
			for (double j : likes) {
				if (j >= likeThreshold) {
					count++;
				}
			}
			if(count>0) {
				postResults.put(i.creatorName, count);
			}
		}
		if(postResults.isEmpty()) {
		    return null;
		}
		return postResults;

	}

	public static double calculateAverageLikes() {
		double sum = 0.0;
		for (CreatorStats c : EngagementBoard) {
			double[] likes = c.weeklyLikes;
			for (double i : likes) {
				sum += i;
			}
		}
		if(count == 0) {
		    return 0;
		}
		return sum / (4 * count);

	}

}
