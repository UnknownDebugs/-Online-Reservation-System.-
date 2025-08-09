import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Ito ang gagamitin para makakuha ng input mula sa user.
		Scanner input = new Scanner(System.in);

		// Dito tinatambak ang mga date na na-reserve na.
		// Ginagamit eto para hindi ma-reserve ulit ang parehong date.
		String unavailableDates = "";

		// Ang `do-while` loop na ito ang nagpapatakbo sa buong program.
		// Uulit lang ang pagpapakita ng main menu pag hindi exit ang pinili ng user.
		do {
			// Ito ang unang menu na ipapakita sa user.
			System.out.println(" ◜━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◝");
			System.out.println("            ( Online Reservation System )         ");
			System.out.println(" 🌟 Thanks for coming in Sweeties Lambingan Hotel! 🌟");
			System.out.println(" ◞━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━◟");
			System.out.println("┌───────────────────────────────────┐");
			System.out.println("│          ✧ ☰ Main Menu ☰ ✧           │");
			System.out.println("│   Please check it so you have an idea  │");
			System.out.println("├────┬──────────────────────────────┤");
			System.out.println("│ (1) │ Reservation   (Room reservation) │");
			System.out.println("├────┼──────────────────────────────┤");
			System.out.println("│ (2) │ About us     (Owner information) │");
			System.out.println("├────┼──────────────────────────────┤");
			System.out.println("│ (3) │ Details      (Hotel information) │");
			System.out.println("├────┼──────────────────────────────┤");
			System.out.println("│ (4) │ Exit              (Out in hotel) │");
			System.out.println("└────┴──────────────────────────────┘");

			System.out.println("┌───────────────────────┐");
			System.out.print("│ Enter your choice:  ");
			// Kinukuha ang piniling option ng user mula sa main menu.
			String mainMenuChoice = input.nextLine();
			System.out.println("└───────────────────────┘");

			System.out.println("                                                                                 ");

			// Ang switch statement na ito ang magdadala
			// sa user sa tamang choices sa program.
			// Bawat case ay tumutugma sa isang menu option.
			switch (mainMenuChoice) {

			// Case 1 Reservation Module
			case "1":
				// Ang flag na nato ay nagpapaalam kung dapat nang bumalik sa main menu.
				boolean backToMain = false;

				// Ang loop nato ay nagpapatakbo sa reservation process.
				// Dito babalik ang user kung gusto niyang magpalit ng room.
				while (!backToMain) {
					System.out.println("┌─────────────────────────────────┐");
					System.out.println("│   🔶 » Please choose your room       │");
					System.out.println("│      you would like preferred. « 🔶  │");
					System.out.println("└─────────────────────────────────┘");
					System.out.println("┌──────────────────────────────────┐");
					System.out.println("│ ☰ input (A)-Start reservation        │");
					System.out.println("├──────────────────────────────────┤");
					System.out.println("│ ⟲ Input (B)-Back                     │");
					System.out.println("└──────────────────────────────────┘");

					String view = "";
					while (true) {
						System.out.println("┌───────────────────────┐");
						System.out.print("│ Enter your choice:  ");
						view = input.nextLine();
						System.out.println("└───────────────────────┘");
						System.out.println("                                                                                 ");
						// Kung `A` ang input, magpapatuloy ang reservation.
						if (view.equalsIgnoreCase("A")) {
							break;
						}
						// Kung `B` ang input, babalik sa main menu.
						else if (view.equalsIgnoreCase("B")) {
							backToMain = true;
							break;
						}
						// Kung mali ang input, lalabas ang invalid message.
						else {
							System.out.println("Invalid type.");
						}
					}

					// Tinitingnan kung dapat bang lumabas sa loop at bumalik sa main menu.
					if (backToMain) {
						break;
					}

					String roomName = "";
					int roomPrice = 0;
					boolean validRoom = false;

					// Ang loop nato ay naghihintay ng tamang pagpili ng room.
					// Uulitin ang pagpapakita ng room options
					// hanggang sa makapili ang user.
					while (!validRoom) {
						// papakita ang mga available na room at ang kanilang mga details.
						System.out.println("┌─────────────────────────────────────┐");
						System.out.println("│            🔶 ROOM DETAILS 🔶            │");
						System.out.println("├─────────────────────────────────────┤");
						System.out.println("│ (1) ➜ NORMAL ROOM           ₱950 / Night │");
						System.out.println("│                               4 guests 𐀪  │");
						System.out.println("│ Includes:                                 │");
						System.out.println("│ • Single bed                              │");
						System.out.println("│ • Electric fan                            │");
						System.out.println("│ • Shared bathroom                         │");
						System.out.println("│ • Basic toiletries (upon request)         │");
						System.out.println("│ ========================================  │");
						System.out.println("│ (2) ➜ STANDARD ROOM      ₱1,500 / Night  │");
						System.out.println("│                               6 guests 𐀪  │");
						System.out.println("│ Includes:                                 │");
						System.out.println("│ • Double bed                              │");
						System.out.println("│ • Air-conditioning                        │");
						System.out.println("│ • Private bathroom (hot & cold)           │");
						System.out.println("│ • Cable TV and free Wi-Fi                 │");
						System.out.println("│ ========================================  │");
						System.out.println("│ (3) ➜ LUXURY ROOM        ₱2,800 / Night  │");
						System.out.println("│                               8 guests 𐀪  │");
						System.out.println("│ Includes:                                 │");
						System.out.println("│ • Queen size bed with clean lines         │");
						System.out.println("│ • Full air-conditioned                    │");
						System.out.println("│ • Private bathroom with toiletries        │");
						System.out.println("│ • Free bottled water and coffee           │");
						System.out.println("│ ========================================  │");
						System.out.println("│ (4) ➜ VIP ROOM           ₱4,500 / Night  │");
						System.out.println("│                             10 guests 𐀪   │");
						System.out.println("│ Includes:                                 │");
						System.out.println("│ • King size bed                           │");
						System.out.println("│ • Sofa set and living area                │");
						System.out.println("│ • 55\" Smart TV in living area             │");
						System.out.println("│ • Mini bar                                │");
						System.out.println("└─────────────────────────────────────┘");

						System.out.println("┌────────────────────────────┐");
						System.out.println("│ Input room number (1,2,3,or 4) │");
						System.out.println("├────────────────────────────┤");
						System.out.println("│ ⟲ Input (B)-Back               │");
						System.out.println("└────────────────────────────┘");
						System.out.println("┌──────────────────────────┐");
						System.out.print("│ Enter your preferred room: ");
						String roomChoice = input.nextLine();
						System.out.println("└──────────────────────────┘");
						System.out.println("                                                                                 ");

						// Kung `B` ang input, babalik sa main menu.
						if (roomChoice.equalsIgnoreCase("B")) {
							backToMain = true;
							break;
						}

						// nilalagay ang name at presyo ng room base sa pinili.
// Eto ay isang switch statement na nagche-check sa pinili ng user sa `roomChoice`.
switch (roomChoice) {

    // Kung ang `roomChoice` ay "1", gagawin ang mga sumusunod
    case "1":
        // I s-set ang name ng room sa "NORMAL ROOM".
        roomName = "NORMAL ROOM";
        // I s-set ang presyo sa 950.
        roomPrice = 950;
        // I s-set ang `validRoom` sa 'true' dahil tama ang pinili.
        validRoom = true;
        // Tapusin na ang case na eto para hindi na ituloy ang iba pang case
        break;

    // Kung "2" naman ang pinili
    case "2":
        // ang name ay magiging "STANDARD ROOM".
        roomName = "STANDARD ROOM";
        // ang presyo ay magiging 1500.
        roomPrice = 1500;
        // at `validRoom` ay magiging 'true'.
        validRoom = true;
        break;

    // Kung "3" naman
    case "3":
        // magiging "LUXURY ROOM" ang name.
        roomName = "LUXURY ROOM";
        // magiging 2800 ang presyo.
        roomPrice = 2800;
        // at `validRoom` ay magiging 'true'.
        validRoom = true;
        break;

    // Kung "4" naman
    case "4":
        // ang pangalan ay "VIP ROOM".
        roomName = "VIP ROOM";
        // ang presyo ay 4500.
        roomPrice = 4500;
        // at `validRoom` ay magiging 'true'.
        validRoom = true;
        break;
    
    // Kung ang pinili ng user ay hindi kasama sa listahan (hindi "1", "2", "3", o "4")...
    default:
        // ...walang mangyayari.


						System.out.println("Invalid room choice. Please enter a number from 1 to 4.");
					}
				}

				if (backToMain) {
					break;
				}

				// nilalagay ang max na bilang ng tao (pax) para sa piniling room.
				int paxLimit = 0;
				if (roomName.equals("NORMAL ROOM")) {
					paxLimit = 4;
				} else if (roomName.equals("STANDARD ROOM")) {
					paxLimit = 6;
				} else if (roomName.equals("LUXURY ROOM")) {
					paxLimit = 8;
				} else if (roomName.equals("VIP ROOM")) {
					paxLimit = 10;
				}

				System.out.println("===================================================");
				System.out.println("You have selected: " + roomName + " at ₱" + roomPrice + " per night.");
				System.out.println(" ➜ Pax limit for this room: " + paxLimit);
				System.out.println("===================================================");
				System.out.println("                                                                                 ");

				boolean reservationFinished = false;

				// Ang loop na ito ay para sa pagpili ng date.
				while (!reservationFinished) {
					// Ipinapakita ang mga date na pwedeng pagpilian.
					System.out.println("┌─────────────────────────────────┐");
					System.out.println("│⬇️ Choose the number you would like ⬇️│");
					System.out.println("├─────────────────────────────────┤");
					System.out.println("│  August    │ September  │  October   │");
					System.out.println("│     1      │     2      │     3      │");
					System.out.println("├─────────────────────────────────┤");
					System.out.println("│  November  │  December  │    Year:   │");
					System.out.println("│     4      │     5      │    2025    │");
					System.out.println("└─────────────────────────────────┘");

					System.out.println("┌──────────────────────────────────┐");
					System.out.println("│ ☰ Choose month number (1,2,3,4,5)    │");
					System.out.println("├──────────────────────────────────┤");
					System.out.println("│ ⟲ Input (B)-Back (to choose another room) │");
					System.out.println("└──────────────────────────────────┘");
					System.out.println("┌───────────────────────┐");
					System.out.print("│ Enter your choice:  ");
					String month = input.nextLine();
					System.out.println("└───────────────────────┘");

					// Kung `B` ang input, babalik sa pagpili ng room.
					if (month.equalsIgnoreCase("B")) {
						break;
					}

					String monthName = "";
					String days = "";
					int startDayOfWeek = 0;

					// Ito ang nagpapakita ng calendar base sa napiling date.
					if (month.equals("1") || month.equals("2") || month.equals("3") || month.equals("4") || month.equals("5")) {
						switch (month) {
						case "1": // AUGUST
							monthName = "August";
							startDayOfWeek = 5;
							// Dito ipi-print ang  August.
							System.out.println("=================================");
							System.out.println("You have selected: August 2025");
							System.out.println("=================================");
							System.out.println("                                                                                 ");
							System.out.println("┌────────────────────────────────────┐");
							System.out.println("│ Mon │ Tue │ Wed │ Thu │ Fri │ Sat │ Sun │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│     │     │     │     │  1  │  2  │  3  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│  4  │  5  │  6  │  7  │  8  │  9  │ 10  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 11  │ 12  │ 13  │ 14  │ 15  │ 16  │ 17  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 18  │ 19  │ 20  │ 21  │ 22  │ 23  │ 24  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 25  │ 26  │ 27  │ 28  │ 29  │ 30  │ 31  │");
							System.out.println("└────────────────────────────────────┘");
							days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
							break;
						case "2": // SEPTEMBER
							monthName = "September";
							startDayOfWeek = 1;
							// Dito ipi-print ang September.
							System.out.println("================================");
							System.out.println("You have selected: September 2025");
							System.out.println("================================");
							System.out.println("                                                                                 ");
							System.out.println("┌────────────────────────────────────┐");
							System.out.println("│ Mon │ Tue │ Wed │ Thu │ Fri │ Sat │ Sun │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│  1  │  2  │  3  │  4  │  5  │  6  │  7  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│  8  │  9  │ 10  │ 11  │ 12  │ 13  │ 14  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 15  │ 16  │ 17  │ 18  │ 19  │ 20  │ 21  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 22  │ 23  │ 24  │ 25  │ 26  │ 27  │ 28  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 29  │ 30  │     │     │     │     │     │");
							System.out.println("└────────────────────────────────────┘");
							days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
							break;
						case "3": // OCTOBER
							monthName = "October";
							startDayOfWeek = 3;
							// Dito ipi-print ang October.
							System.out.println("================================");
							System.out.println("You have selected: October 2025");
							System.out.println("================================");
							System.out.println("                                                                                 ");
							System.out.println("┌────────────────────────────────────┐");
							System.out.println("│ Mon │ Tue │ Wed │ Thu │ Fri │ Sat │ Sun │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│     │     │  1  │  2  │  3  │  4  │  5  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│  6  │  7  │  8  │  9  │ 10  │ 11  │ 12  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 13  │ 14  │ 15  │ 16  │ 17  │ 18  │ 19  │");
							System.out.println("│ 20  │ 21  │ 22  │ 23  │ 24  │ 25  │ 26  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 27  │ 28  │ 29  │ 30  │ 31  │     │     │");
							System.out.println("└────────────────────────────────────┘");
							days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
							break;
						case "4": // NOVEMBER
							monthName = "November";
							startDayOfWeek = 6;
							// Dito ipi-print ang November.
							System.out.println("==================================");
							System.out.println("You have selected: November 2025");
							System.out.println("==================================");
							System.out.println("                                                                                 ");
							System.out.println("┌────────────────────────────────────┐");
							System.out.println("│ Mon │ Tue │ Wed │ Thu │ Fri │ Sat │ Sun │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│     │     │     │     │     │  1  │  2  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│  3  │  4  │  5  │  6  │  7  │  8  │  9  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 10  │ 11  │ 12  │ 13  │ 14  │ 15  │ 16  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 17  │ 18  │ 19  │ 20  │ 21  │ 22  │ 23  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 24  │ 25  │ 26  │ 27  │ 28  │ 29  │ 30  │");
							System.out.println("└────────────────────────────────────┘");
							days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30";
							break;
						case "5": // DECEMBER
							monthName = "December";
							startDayOfWeek = 1;
							// Dito ipi-print ang December.
							System.out.println("===================================");
							System.out.println("You have selected: December 2025");
							System.out.println("===================================");
							System.out.println("                                                                                 ");
							System.out.println("┌────────────────────────────────────┐");
							System.out.println("│ Mon │ Tue │ Wed │ Thu │ Fri │ Sat │ Sun │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│  1  │  2  │  3  │  4  │  5  │  6  │  7  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│  8  │  9  │ 10  │ 11  │ 12  │ 13  │ 14  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 15  │ 16  │ 17  │ 18  │ 19  │ 20  │ 21  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 22  │ 23  │ 24  │ 25  │ 26  │ 27  │ 28  │");
							System.out.println("├────────────────────────────────────┤");
							System.out.println("│ 29  │ 30  │ 31  │     │     │     │     │");
							System.out.println("└────────────────────────────────────┘");
							days = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
							break;
						}
					} else {
						// Kung mali ang input sa month lalabas ang invalid nato.
						System.out.println("Invalid input month.");
						continue;
					}

					// Ang loop nato ay para sa pagpili ng day.
					boolean backToMonth = false;
					while (!backToMonth) {
						String day = "";
						boolean validDay = false;
						String selectedWeekday = "";
						String[] weekdays = {"", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

						// Ang loop nato ay sisiguguraduhing na ang pipiliin ng user ay valid na day.
						while (!validDay) {
							System.out.println("┌──────────────────────────────────┐");
							System.out.println("│ ☰ Choose your day preferred          │");
							System.out.println("├──────────────────────────────────┤");
							System.out.println("│ ⟲ Input (B)-Back                     │");
							System.out.println("└──────────────────────────────────┘");
							System.out.println("┌───────────────────────┐");
							System.out.print("│ Enter your choice:  ");
							day = input.nextLine();
							System.out.println("└───────────────────────┘");

							// Kung `B` ang input, babalik sa pagpili ng month.
							if (day.equalsIgnoreCase("B")) {
								backToMonth = true;
								break;
							}

							// Mahalaga etong part
							// C check neto kung ang day ay valid at kung hindi pa ito na-reserve.
							if ((" " + days + " ").contains(" " + day + " ") && !unavailableDates.contains(roomName + " " + day + " of " + monthName)) {
								validDay = true;
								int dayNumber = Integer.parseInt(day);
								int weekdayCounter = startDayOfWeek;

								for (int i = 1; i < dayNumber; i++) {
									weekdayCounter++;
									if (weekdayCounter > 7) {
										weekdayCounter = 1;
									}
								}

								selectedWeekday = weekdays[weekdayCounter];
								System.out.println("                                                                                 ");

								System.out.println("======================================");
								System.out.println("You selected: " + monthName + " " + day + " " + selectedWeekday + ", 2025");
								System.out.println("======================================");
								System.out.println("                                                                                 ");

							} else {
								// output kung mali ang araw o na-reserve na.
								System.out.println("Invalid day or day is unavailable for this room.");
							}
						}

						if (backToMonth) {
							break;
						}

						// dinadagdag ang piniling month sa listahan ng mga unavailable dates.
						unavailableDates += roomName + " " + day + " of " + monthName + ",";

						// Dito hihingin ang personal na impormasyon ng user.
						System.out.println("┌───────────────────────────────────┐");
						System.out.println("│       🔶 Input your details.           │");
						System.out.println("│            Input (B)-back.  🔶         │");
						System.out.println("├───────────────────────────────────┤");

						// NAME
						String name = "";
						boolean backToDay = false;
						while (true) {
							System.out.print(" (B)│➜ Name: ");
							name = input.nextLine();

							// Kung `B` ang input, babalik sa pagpili ng araw.
							if (name.equalsIgnoreCase("B")) {
								backToDay = true;
								break;
							}
							if (!name.isEmpty()) {
								break;
							}
							System.out.println("Invalid input.");
						}
						if (backToDay) {
							// Inaalis ang month sa `unavailableDates` para mapili ulit.
							unavailableDates = unavailableDates.replace(roomName + " " + day + " of " + monthName + ",", "");
							continue;
						}

						// Ipinapakita ang napiling month.
						String date = monthName + " " + day + " " + selectedWeekday;
						System.out.println(" (B)│➜ Date: " + date + ", 2025");

						// Ipinapakita ang pax limit.
						int pax = paxLimit;
						System.out.println(" (B)│➜ Pax: " + pax + " (Based on " + roomName + ")");

						// CONTACT NUMBER
						String contact = "";
						boolean backToName = false;
						while (true) {
							System.out.print(" (B)│➜ Contact Number: ");
							contact = input.nextLine();

							if (contact.equalsIgnoreCase("B")) {
								backToName = true;
								break;
							}

							// Tinitingnan kung puro numero lang ang input.
							if (!contact.isEmpty() && contact.matches("\\d+")) {
								// Sa contact part, gamit "\\d+" para
								// puro digits lang (0-9) ang tatanggapin
								break;
							}

							System.out.println("Invalid input. Please enter numbers only.");
						}
						if (backToName) {
							unavailableDates = unavailableDates.replace(roomName + " " + day + " of " + monthName + ",", "");
							continue;
						}

						// EMAIL
						String email = "";
						boolean backToContact = false;
						while (true) {
							System.out.print(" (B)│➜ Email Address: ");
							email = input.nextLine();
							System.out.println("└───────────────────────────────────┘");

							if (email.equalsIgnoreCase("B")) {
								backToContact = true;
								break;
							}
							if (!email.isEmpty()) {
								break;
							}
							System.out.println("Invalid input.");
						}
						if (backToContact) {
							unavailableDates = unavailableDates.replace(roomName + " " + day + " of " + monthName + ",", "");
							continue;
						}

						System.out.println("                                                                                 ");
						System.out.println("=======================");
						System.out.println(" Reserved successful!");
						System.out.println("======================");
						System.out.println("                                                                                 ");
						System.out.println("┌────────────────────────────┐");
						System.out.println("│ Input (S) to show your receipt. │");
						System.out.println("└────────────────────────────┘");

						String viewReceipt = "";
						while (true) {
							System.out.print("Enter: ");
							viewReceipt = input.nextLine();
							if (viewReceipt.equalsIgnoreCase("S")) {
								break;
							}
							System.out.println("Invalid input");
						}

						// Ipinapakita ang buong receipt ng reservation.
						System.out.println("┌─────────────────────────────┐");
						System.out.println("        Hotel Reservation      ");
						System.out.println("             Receipt           ");
						System.out.println("├─────────────────────────────┤");
						System.out.println(" Name: " + name);
						System.out.println(" Date: " + date + ", 2025");
						System.out.println(" Room: " + roomName);
						System.out.println(" Price: ₱ " + roomPrice + ".00");
						System.out.println(" Pax: " + pax);
						System.out.println(" Contact: " + contact);
						System.out.println(" Email: " + email);
						System.out.println("└─────────────────────────────┘");

						String receipt = "";
						boolean choices = true;
						// Dito pipili ang user kung i c-cancel o i c-confirm ang reservation.
						while (choices) {
							System.out.println("┌───────────────────────────────┐");
							System.out.println("│  ⚠️ Please review your receipt    │");
							System.out.println("│     details before confirming.    │");
							System.out.println("├───────────────────────────────┤");

							System.out.println("└───────────────────────────────┘");
							System.out.println("┌─────────────────────────────────┐");
							System.out.println("│➜ Input (1) to cancel reservation ✖  │");
							System.out.println("├─────────────────────────────────┤");
							System.out.println("│➜ Input (2) to confirm reservation ✓ │");
							System.out.println("└─────────────────────────────────┘");
							System.out.print("Input: ");
							receipt = input.nextLine();

							String reserved = roomName + " " + day + " of " + monthName;

							switch (receipt) {
							// Kung `1` ang input, i c-cancel ang reservation.
							case "1":
								System.out.println("Your reservation has been cancelled.");
								// Aalisin ang month sa listahan ng na-reserve.
								unavailableDates = unavailableDates.replace(reserved + ",", "");
								choices = false;
								break;
							// Kung `2` ang input, i c-confirm ang reservation.
							case "2":
								System.out.println("Thank you! Your reservation is saved.");
								choices = false;
								break;
							default:
								System.out.println("Invalid input.");
							}
						}

						// Kapag tapos na ang reservation, babalik sa pagpili ng room.
						reservationFinished = true;
						backToMonth = true;
					}
					break;
				}
				if (backToMain) {
					break;
				}
			}
			break;

			// Case 2 About Us part
		case "2":
			// Ipinapakita ang impormasyon tungkol sa hotel at sa mga developer.
			System.out.println("┌───────────────────────────────────┐");
			System.out.println("│               ABOUT US                 │");
			System.out.println("├───────────────────────────────────┤");
			System.out.println("│       Stay a while, feel at home —     │");
			System.out.println("│       Sweeties Hotel welcomes you.     │");
			System.out.println("│                                        │");
			System.out.println("│      👤 Sweeties Hotel                 │");
			System.out.println("│      📍 Tayuman 199, San Carlos        │");
			System.out.println("│      📞 0994-613-3680                  │");
			System.out.println("│      📩 sweetiesgroup4@email.com       │");
			System.out.println("│                                                  │");
			System.out.println("│           Develop by Group 4           │");
			System.out.println("│          Agripa, Apdua, Basco          │");
			System.out.println("│          Cari, Duron, De Leon          │");
			System.out.println("│             Medina, Monday             │");
			System.out.println("└───────────────────────────────────┘");

			String backInput2;
			// Hinihintay na i-type ng user ang `B` bago bumalik sa main menu.
			do {
				System.out.println("┌─────────────────────────────────────┐");
				System.out.println("│ (B) │ Input (B)-Back to return main menu │");
				System.out.println("└─────────────────────────────────────┘");
				System.out.print("Enter: ");

				backInput2 = input.nextLine();
				if (!backInput2.equalsIgnoreCase("B")) {
					System.out.println("Invalid input. Please type 'B'.");
				}
			} while (!backInput2.equalsIgnoreCase("B"));
			break;

			// Case 3 Details part
		case "3":
			// papakita ang mga details ng bawat room at ang hotel policy.
			System.out.println("┌─────────────────────────────────────┐");
			System.out.println("│            🟢 ROOM DETAILS 🟢             │");
			System.out.println("├─────────────────────────────────────┤");
			System.out.println("│ (1) ➜ NORMAL ROOM           ₱950 / Night │");
			System.out.println("│                               4 guests 𐀪  │");
			System.out.println("│ Includes:                                 │");
			System.out.println("│ • Single bed                              │");
			System.out.println("│ • Electric fan                            │");
			System.out.println("│ • Shared bathroom                         │");
			System.out.println("│ • Basic toiletries (upon request)         │");
			System.out.println("│ ========================================= │");
			System.out.println("│ (2) ➜ STANDARD ROOM      ₱1,500 / Night  │");
			System.out.println("│                               6 guests 𐀪  │");
			System.out.println("│ Includes:                                 │");
			System.out.println("│ • Double bed                              │");
			System.out.println("│ • Air-conditioning                        │");
			System.out.println("│ • Private bathroom (hot & cold)           │");
			System.out.println("│ • Cable TV and free Wi-Fi                 │");
			System.out.println("│ ========================================= │");
			System.out.println("│ (3) ➜ LUXURY ROOM        ₱2,800 / Night  │");
			System.out.println("│                               8 guests 𐀪  │");
			System.out.println("│ Includes:                                 │");
			System.out.println("│ • Queen size bed with clean lines         │");
			System.out.println("│ • Full air-conditioned                    │");
			System.out.println("│ • Private bathroom with toiletries        │");
			System.out.println("│ • Free bottled water and coffee           │");
			System.out.println("│ ========================================= │");
			System.out.println("│ (4) ➜ VIP ROOM           ₱4,500 / Night  │");
			System.out.println("│                              10 guests 𐀪  │");
			System.out.println("│ Includes:                                 │");
			System.out.println("│ • King size bed                           │");
			System.out.println("│ • Sofa set and living area                │");
			System.out.println("│ • 55\" Smart TV in living area             │");
			System.out.println("│ • Mini bar                                │");
			System.out.println("└─────────────────────────────────────┘");

			System.out.println("┌─────────────────────────────────────────┐");
			System.out.println("│     📜 SWEETIES LAMBINGAN HOTEL POLICY 📜     │");
			System.out.println("├─────────────────────────────────────────┤");
			System.out.println("│ 1. Once you reserve a date, it will be marked │");
			System.out.println("│    as unavailable and cannot be booked again. │");
			System.out.println("│                                               │");
			System.out.println("│ 2. Reservation is confirmed only after you    │");
			System.out.println("│    complete the process in this system.       │");
			System.out.println("│                                               │");
			System.out.println("│ 3. Refunds or date changes are not allowed    │");
			System.out.println("│    once the reservation is confirmed.         │");
			System.out.println("└─────────────────────────────────────────┘");
			System.out.println("┌─────────────────────────────────────┐");
			System.out.println("│ (B) │ Input (B)-Back to return main menu │");
			System.out.println("└─────────────────────────────────────┘");

			String backInput3;
			// Hinihintay na i-type ng user ang `B` bago bumalik sa main menu.
			do {
				System.out.print("Enter: ");
				backInput3 = input.nextLine();
				if (!backInput3.equalsIgnoreCase("B")) {
					System.out.println("Invalid input. Please type 'B'.");
				}
			} while (!backInput3.equalsIgnoreCase("B"));
			break;

			// Case 4 Exit Program part
		case "4":
			System.out.println("Thank you for choosing Sweeties Hotel. Goodbye!");
			input.close();
			// Ang `return` statement ang nagpapatigil sa program
			return;

			// Default
		default:
			// output kung mali ang input sa main menu.
			System.out.println("Invalid choice. Please enter a number from 1 to 4.");
		}
	} while (true);
}
}
