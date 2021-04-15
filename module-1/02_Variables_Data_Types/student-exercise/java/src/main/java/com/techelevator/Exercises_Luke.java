package com.techelevator;

public class Exercises_Luke {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlay 	= 3;				  				// # of raccoons playing in woods
		int raccoonsgoHome 	= 2; 				 				// # of raccoons went home to eat
		int raccoonsLeftInWoods = raccoonsPlay-raccoonsgoHome;
		System.out.println((raccoonsLeftInWoods)+" raccoon left in the woods"); 			   // # of raccoons left in woods
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numOfFlowers    = 5;					    	  	// # of flowers
		int numOfBees 		= 3; 							  	// # of bees
		int beesLessThanFlowers = numOfBees - numOfFlowers;		// # of bees less than flowers
		System.out.println((beesLessThanFlowers)+" = less bees than flowers");				  	// # of bees less than flowers
		
		double x = 4.9;
		int y = (int)x;
		System.out.println(4.9*4.9);
		
		
		/*       
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1; 								    // # of pigeons eating bread crumbs
		int addPigeon    = 1; 									// # of pigeons came to join
		int totalPigeons = lonelyPigeon + addPigeon;			// # of pigeons now eating bread crumbs
		System.out.println((totalPigeons)+" pigeons eating breadcrumbs");						// # of pigeons eating breadcrumbs
		/*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSitting  = 3; 									// # of owls sitting on fence
		int owlsJoined   = 2; 									// # of owls joined on fence
		int owlsOnFence = owlsSitting + owlsJoined;
		System.out.println("# of owls on the fence = "+(owlsOnFence));							// # of owls on fence
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking  = 2; 								// beavers working on their home
		int beaversSwimming = 1;  								// beavers that went for a swim
		int beaversStillWorking = beaversWorking - beaversSwimming;
		System.out.println("# of beavers still working = "+(beaversStillWorking));				// # of beavers still working on home	
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting   = 2;			 					// # of toucans sitting on limb
		int toucansJoined 	= 1;								// # of toucans that joined on limb	
		int toucansInAll = toucansSitting + toucansJoined;
		System.out.println("total # of toucans on limb = "+(toucansInAll));						// # of sitting & joined toucans
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelNuts 	= 2;								// # of squirrels with nuts
		int squirrel     	= 4;								// # of squirrels without nuts
		int moreSquirrelsThanNuts = squirrel/squirrelNuts;
		System.out.println("# of squirrels left	= "+(moreSquirrelsThanNuts)); 					// more squirrels than nuts
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double nickels 		= (.05*2);								// # of nickels
		double dimes 		= (.10*1);								// # of dimes
		double quarters		= (.25*1);								// # of quarters
		double totalMoneyFound = (nickels+dimes+quarters);
		System.out.println("total money found = $" + (totalMoneyFound));						// total amount of money found
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier			= 18;								// # of muffins from Mrs. Brier's class
		int macAdams		= 20;								// # of muffins fromMrs. MacAdams's class
		int flannery 		= 17;								// # of muffins fromMrs. Flannery's class
		int allOfFirstGrade = (brier+macAdams+flannery);
		System.out.println("Mrs. Hilt's 1st grade classes baked "+(allOfFirstGrade)+" muffins ");
																									//total # of muffins all of Mrs. Hilts 1st grade baked
		/*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo			   = 0.24;							// cost of yoyo
		double whistle		   = 0.14;							// cost of whistle
		double bothToys = yoyo+whistle;
		System.out.println("total money spent on yoyo & whistle " + (bothToys));					// total money spent on yoyo & whistle
		/*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrispieTreats = 5;								// # of rice krispie treats
		int miniMarhmellows = 10;								// # of mini marshmellows
		int largeMarshmellows = 8;								// # of large marshmellows
		int marshmellowsAltogether = (miniMarhmellows+largeMarshmellows);
		System.out.println((riceKrispieTreats)*(marshmellowsAltogether)+" were used in Mrs. Hilt's rice krispie treats");
																									// total # marshmellows used all of the rice krispie treats 
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int inchesOfSnow = 29;									// Mrs. Hilt's snow fall
		int snowAtSchool = 17;									// Brecknock Elementary's snow fall
		int moreSnowAtHiltsHouse = (inchesOfSnow-snowAtSchool);
		System.out.println("Mrs. Hilt had "+(moreSnowAtHiltsHouse)+" more inches of snow than the school");
																									// Mrs. Hilt's snow fall minus the school's snow fall
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double currentlyHas = 10;								// amt of money Mrs. Hilt currently has
		double spendsOnTruck = 3;								// amt spent on toy truck
		double spendsOnPencil = 2;								// amt spent on pencil
		double moneyLeft = (currentlyHas-spendsOnTruck-spendsOnPencil);
		System.out.println("Mrs. Hilt has $" + (moneyLeft)+" left");								// Money left after subtracting truck & pencil from current
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesJoshHas = 16;								// # of starting marbles
		int marblesJoshLost = 7;								// # of marbles lost
		int totalMarbles = marblesJoshHas-marblesJoshLost;
		System.out.println("Josh has "+(totalMarbles)+" marbles left");								// # of marblesJoshLost subtracted from marblesJoshHas 
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashells = 19;										// # of shells Megan has
		int totalCollection = 25;								// # of shells Megan needs to complete collection
		int moreSeashellsToFind = (totalCollection-seashells);
		System.out.println("Megan needs "+(moreSeashellsToFind)+" more seashells to complete her collection");
																									// collection minus current shells = # still needed
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int totalBalloons = 17;				// Brad has a total of 17 balloons
        int redBalloons = 8;				// 8 balloons are red, the rest are green
        int greenBalloons = totalBalloons-redBalloons;
        System.out.println("Brad has " + (greenBalloons) + " green balloons");						// 17 balloons - 8 red balloons = # of green balloons	
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksMartaAdds = 10;			// Marta adds 10 books to the shelf
        int booksOnShelf = 38;				// The shelf already had 38 books on it
        int totalBooksOnShelf = booksOnShelf+booksMartaAdds;
        System.out.println("Total # of books on shelf = " + (totalBooksOnShelf));  					// # of books on the shelf after adding Marta's 10
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int numOfBeesLegs = 6;				// Bees have 6 legs
        int eightBees = 8;					// there are 8 bees in total
        int eightBeesLegs = numOfBeesLegs*eightBees;
        System.out.println("8 bees have a total of "+ (eightBeesLegs) + " legs");					// # of legs that 8 bees have
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        int numOfCones = 2;					// # of ice cream cones
        double iceCreamConesCost = .99;		// cost per each cone
        double twoIceCreamConesCost = iceCreamConesCost * numOfCones;
        System.out.println("2 ice cream cones cost $" + twoIceCreamConesCost);						// total cost of ice cream cones
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int rocksMrsHiltHas = 64;			// # of rocks Mrs. Hilt already has
        int rocksToCompleteBorder = 125;	// # of rocks needed to complete border
        int rocksNeeded = (rocksToCompleteBorder - rocksMrsHiltHas);
        System.out.println("Mrs. Hilt still needs " + (rocksNeeded) + " rocks to complete the border");
        																							// # of rocks still needed to complete border
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int hiltHadMarbles = 38;			// # of marbles Mrs. Hilt had
        int hiltLostMarbles = 15;			// # of marbles Mrs. Hilt lost
        int hiltMarblesLeft = (hiltHadMarbles - hiltLostMarbles);
        System.out.println("Mrs. Hilt has " + (hiltMarblesLeft) + " marbles left");					// # of marbles Mrs. Hilt has left
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int droveToConcert = 78;
		int stoppedForGas = 32;
		int milesLeftToDrive = (droveToConcert-stoppedForGas);
		System.out.println("Mrs. Hilt still has " + (milesLeftToDrive) + " miles left to drive");	// # of miles Mrs. Hilt has left to drive
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double timeShovelingSnow = 1.5;
			   timeShovelingSnow += .75;
		System.out.println(timeShovelingSnow);
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double moneySpentOnhotDogs = .50;
			   moneySpentOnhotDogs *= 6;
		System.out.println(moneySpentOnhotDogs);
		        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int hiltsMoney = 50 % 7;
		System.out.println(hiltsMoney);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int hiltSawButterflies = 33;
		int orangeButterflies = 20;
		System.out.println(hiltSawButterflies - orangeButterflies);
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		float katesMoney = 1.00f;
			  katesMoney -= .54;
		System.out.println(katesMoney);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int marksTrees = 13;
			marksTrees += 12;
		System.out.println(marksTrees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hoursInDay = 24;
			hoursInDay *= 2;
		System.out.println(hoursInDay);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
			cousins *= 5;
		System.out.println(cousins);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        double dansMoney = 3.00;
		double candyBarCost = 1.00;
		System.out.println(dansMoney - candyBarCost);
                /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boatsOnLake = 5;
		int peopleOnBoats = 3;
		System.out.println(boatsOnLake * peopleOnBoats);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int ellensLegos = 380;
        	ellensLegos -= 57;
        System.out.println(ellensLegos);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int muffinsNeeded = 83;
        int muffinsMade = 35;
        System.out.println(muffinsNeeded-muffinsMade);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int crayonsWilly = 1400;
    	int crayonsLucy = 290;
    	System.out.println(crayonsWilly - crayonsLucy);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickers = 10;
			stickers *= 22;
		System.out.println(stickers);
		        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupCakes = 96;
			cupCakes /= 8;
		System.out.println(cupCakes);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
	    int gingerBreadCookies = 47;
	        gingerBreadCookies %= 6;
	        System.out.println(gingerBreadCookies);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
	    int croissants = 59;
	    	croissants %= 8;
	    System.out.println(croissants);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookies = 276;
    		cookies /= 12;
    	System.out.println(cookies);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480;
	    	pretzels /= 12;
	    System.out.println(pretzels);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupCakes = 53;
		System.out.println((lemonCupCakes - 2) /3);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotSticks = 74;
			carrotSticks %= 12;
		System.out.println(carrotSticks);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		 int susiesTeddyBears = 98;
		 	 susiesTeddyBears /= 7;
		 System.out.println(susiesTeddyBears);
		 
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		 int susiesFamilyPictures = 480;
		 	 susiesFamilyPictures /= 20;
		 System.out.println(susiesFamilyPictures);
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		 int totalCards = 94;
		 int boxMax = 8;
		 int totalBoxes = totalCards / boxMax;
		 int leftOverCards = totalBoxes - totalCards;
		 System.out.println(totalBoxes);
		 System.out.println(totalBoxes - boxMax);
		        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		 int fatherBooks = 210;
		 int bookShelves = 10;
		 System.out.println(fatherBooks / bookShelves);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		 int bakedCroissants = 17;
		 	 bakedCroissants %= 7;
		 System.out.println(bakedCroissants);
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
