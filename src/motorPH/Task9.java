package motorPH;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
	
Scanner input = new Scanner(System.in);
		
		String employeeName, birthDate, address, phoneNumber, sss, philHealth, 
		tin, pagIbig, status, position, iSupervisor,week,monthhours;
		
		int employeeNumber,basicSalary, riceSubsidy, pAllowance, cAllowance, grossSemiMR, grossWeeklySalary;
		
		
		System.out.print("Employee Number: ");
		employeeNumber = input.nextInt();
		input.close();
		System.out.println();
		System.out.println();
		
		switch (employeeNumber){ 
		case 10001:
		
	
			//inputs
				employeeName = "Jose Crisostomo";
				birthDate = "2/14/1988";
				address = "17/85 Stracke Via Suite 042, Poblacion, Las Pinas 4783 Dinagat Islands";
				phoneNumber = "918-621-603";
				basicSalary = 62670;
				grossSemiMR = 11250;
				double hourlyRate1 = 373.04;
				double hoursWorkedInAWeek1 = 16.00;
				double grossWeeklySalary1 = hourlyRate1*hoursWorkedInAWeek1; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

				System.out.println("Employee Name                                 : "+employeeName); // Employees Name
				System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
				System.out.println("Address                                       : "+address); // Employees Address
				System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

				System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

				System.out.println("Hourly Rate                                   : "+hourlyRate1); // Employees Hourly Rate 
				System.out.println();
				System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek1); //Hours Worked In a Week 1 on December
				System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary1);
				
			break;
			
		case 10002:

				//inputs
				employeeName = "Christian Mata";
				birthDate = "10/21/1987";
				address = "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu";
				phoneNumber = "783-776-744";
				basicSalary = 42975;
				grossSemiMR = 21488;
				double hourlyRate2 = 255.80;
				double hoursWorkedInAWeek2 = 16.00;
				double grossWeeklySalary2 = hourlyRate2*hoursWorkedInAWeek2; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary
	
				System.out.println("Employee Name                                 : "+employeeName); // Employees Name
				System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
				System.out.println("Address                                       : "+address); // Employees Address
				System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number
	
				System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 
	
				System.out.println("Hourly Rate                                   : "+hourlyRate2); // Employees Hourly Rate 
				System.out.println();
				System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek2); //Hours Worked In a Week 1 on December
				System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary2);
			break;
			
		case 10003:

			//inputs
			employeeName = "Brad San Jose";
			birthDate = "3/15/1996";
			address = "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi";
			phoneNumber = "797-009-261";
			basicSalary = 42975;
			grossSemiMR = 21488;
			double hourlyRate3 = 255.80;
			double hoursWorkedInAWeek3 =  12.50;
			double grossWeeklySalary3 = hourlyRate3*hoursWorkedInAWeek3; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate3); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek3); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary3);
		break;
		
		case 10004:

			//inputs
			employeeName = "Anthony Salcedo";
			birthDate = "9/14/1993";
			address = "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate";
			phoneNumber = "070-766-300";
			basicSalary = 60825;
			grossSemiMR = 30413;
			double hourlyRate4 = 362.05;
			double hoursWorkedInAWeek4 = 16.00;
			double grossWeeklySalary4 = hourlyRate4*hoursWorkedInAWeek4; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate4); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek4); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary4);
		break;
			
		case 10005:

			//inputs
			employeeName = "Alice Romualdez";
			birthDate = "5/14/1992";
			address = "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte";
			phoneNumber = "983-606-799";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate5 = 133.93;
			double hoursWorkedInAWeek5 = 15.75; 
			double grossWeeklySalary5 = hourlyRate5*hoursWorkedInAWeek5; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate5); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek5); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary5);
		break;
		
		case 10006:

			//inputs
			employeeName = "Rosie Atienza";
			birthDate = "9/24/1948";
			address = "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte";
			phoneNumber = "266-036-427";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate6 = 133.93;
			double hoursWorkedInAWeek6 = 16.00; 
			double grossWeeklySalary6 = hourlyRate6*hoursWorkedInAWeek6; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate6); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek6); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary6);
		break;
		
		case 10007:

			//inputs
			employeeName = "Martha Farala";
			birthDate = "1/11/1942";
			address = "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte";
			phoneNumber = "329-034-366";
			basicSalary = 24000;
			grossSemiMR = 12000;
			double hourlyRate7 = 142.86;
			double hoursWorkedInAWeek7 = 16.00; 
			double grossWeeklySalary7 = hourlyRate7*hoursWorkedInAWeek7; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate7); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek7); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary7);
		break;
		
		case 10008:

			//inputs
			employeeName = "Leila Martinez";
			birthDate = "7/11/1970";
			address = "37/46 Kulas Roads, Maragondon 0962 Quirino";
			phoneNumber = "877-110-749";
			basicSalary = 24000;
			grossSemiMR = 12000;
			double hourlyRate8 = 142.86;
			double hoursWorkedInAWeek8 = 15.83; 
			double grossWeeklySalary8 = hourlyRate8*hoursWorkedInAWeek8; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate8); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek8); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary8);
		break;
		
		case 10009:

			//inputs
			employeeName = "Allison San Jose";
			birthDate = "6/24/1986";
			address = "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union";
			phoneNumber = "179-075-129";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate9 = 133.93;
			double hoursWorkedInAWeek9 = 16.00; 
			double grossWeeklySalary9 = hourlyRate9*hoursWorkedInAWeek9; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate9); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek9); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary9);
		break;
		
		case 10010:

			//inputs
			employeeName = "Cydney Rosario";
			birthDate = "10/6/1996";
			address = "93A/21 Berge Points, Tapaz 2180 Quezon";
			phoneNumber = "868-819-912";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate10 = 133.93;
			double hoursWorkedInAWeek10 = 15.75; 
			double grossWeeklySalary10 = hourlyRate10*hoursWorkedInAWeek10; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate10); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek10); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary10);
		break;
		
		case 10011:

			//inputs
			employeeName = "Josie Lopez";
			birthDate = "1/14/1937";
			address = "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro";
			phoneNumber = "478-355-427";
			basicSalary = 38475;
			grossSemiMR = 19238;
			double hourlyRate11 = 229.02;
			double hoursWorkedInAWeek11 = 13.50; 
			double grossWeeklySalary11 = hourlyRate11*hoursWorkedInAWeek11; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate11); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek11); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary11);
		break;
		
		case 10012:

			//inputs
			employeeName = "Selena De Leon";
			birthDate = "2/20/1945";
			address = "89A Armstrong Trace, Compostela 7874 Maguindanao";
			phoneNumber = "975-432-139";
			basicSalary = 41850;
			grossSemiMR = 20925;
			double hourlyRate12 = 249.11;
			double hoursWorkedInAWeek12 = 16.00; 
			double grossWeeklySalary12 = hourlyRate12*hoursWorkedInAWeek12; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate12); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek12); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary12);
		break;
		
		case 10013:

			//inputs
			employeeName = "Fredrick Romualdez";
			birthDate = "3/10/1985";
			address = "22A/52 Lubowitz Meadows, Pililla 4895 Zambales";
			phoneNumber = "023-079-009";
			basicSalary = 63500;
			grossSemiMR = 31750;
			double hourlyRate13 = 377.98;
			double hoursWorkedInAWeek13 = 16.00; 
			double grossWeeklySalary13 = hourlyRate13*hoursWorkedInAWeek13; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate13); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek13); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary13);
		break;
		
		case 10014:

			//inputs
			employeeName = "Mark Bautista";
			birthDate = "2/12/1961";
			address = "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino";
			phoneNumber = "683-725-348";
			basicSalary = 23250;
			grossSemiMR = 11625;
			double hourlyRate14 = 138.39;
			double hoursWorkedInAWeek14 = 16.00; 
			double grossWeeklySalary14 = hourlyRate14*hoursWorkedInAWeek14; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate14); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek14); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary14);
		break;
		
		case 10015:

			//inputs
			employeeName = "Darlene Lazaro";
			birthDate = "11/25/1985";
			address = "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino";
			phoneNumber = "740-721-558";
			basicSalary = 23250;
			grossSemiMR = 11625;
			double hourlyRate15 = 138.39;
			double hoursWorkedInAWeek15 = 16.00; 
			double grossWeeklySalary15 = hourlyRate15*hoursWorkedInAWeek15; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate15); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek15); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary15);
		break;
		
		case 10016:

			//inputs
			employeeName = "Kolby Delos Santos";
			birthDate = "2/26/1980";
			address = "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur";
			phoneNumber = "739-443-033";
			basicSalary = 24000;
			grossSemiMR = 12000;
			double hourlyRate16 = 142.86;
			double hoursWorkedInAWeek16 = 16.00; 
			double grossWeeklySalary16 = hourlyRate16*hoursWorkedInAWeek16; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate16); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek16); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary16);
		break;
		
		case 10017:

			//inputs
			employeeName = "Vella Santos";
			birthDate = "12/31/1983";
			address = "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur";
			phoneNumber = "955-879-269";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate17 = 133.93;
			double hoursWorkedInAWeek17 = 15.92; 
			double grossWeeklySalary17 = hourlyRate17*hoursWorkedInAWeek17; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate17); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek17); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary17);
		break;
		
		case 10018:

			//inputs
			employeeName = "Tomas Del Rosario";
			birthDate = "12/18/1978";
			address = "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque";
			phoneNumber = "882-550-989";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate18 = 133.93;
			double hoursWorkedInAWeek18 = 16.00; 
			double grossWeeklySalary18 = hourlyRate18*hoursWorkedInAWeek18; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate18); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek18); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary18);
		break;
		
		case 10019:

			//inputs
			employeeName = "Jacklyn Tolentino";
			birthDate = "5/19/1944";
			address = "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao";
			phoneNumber = "675-757-366";
			basicSalary = 24000;
			grossSemiMR = 12000;
			double hourlyRate19 = 142.86;
			double hoursWorkedInAWeek19 = 16.00; 
			double grossWeeklySalary19 = hourlyRate19*hoursWorkedInAWeek19; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate19); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek19); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary19);
		break;
		
		case 10020:

			//inputs
			employeeName = "Percival Gutierrez";
			birthDate = "12/18/1970";
			address = "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur";
			phoneNumber = "512-899-876";
			basicSalary = 24750;
			grossSemiMR = 12375;
			double hourlyRate20 = 147.32;
			double hoursWorkedInAWeek20 = 16.00;
			double grossWeeklySalary20 = hourlyRate20*hoursWorkedInAWeek20; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate20); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek20); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary20);
		break;
		
		case 10021:

			//inputs
			employeeName = "Garfield Manalaysay";
			birthDate = "8/28/1966";
			address = "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur";
			phoneNumber = "948-628-136";
			basicSalary = 24750;
			grossSemiMR = 12375;
			double hourlyRate21 = 147.32;
			double hoursWorkedInAWeek21 = 11.00; 
			double grossWeeklySalary21 = hourlyRate21*hoursWorkedInAWeek21; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate21); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek21); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary21);
		break;
		
		case 10022:

			//inputs
			employeeName = "Lizeth Villegas";
			birthDate = "12/12/1981";
			address = "66/77 Mann Views, Luisiana 1263 Dinagat Islands";
			phoneNumber = "332-372-215";
			basicSalary = 24000;
			grossSemiMR = 12000;
			double hourlyRate22 = 142.86;
			double hoursWorkedInAWeek22 = 16.00; 
			double grossWeeklySalary22 = hourlyRate22*hoursWorkedInAWeek22; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate22); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek22); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary22);
		break;
		
		case 10023:

			//inputs
			employeeName = "Carol Ramos";
			birthDate = "8/20/1978";
			address = "72/70 Stamm Spurs, Bustos 4550 Iloilo";
			phoneNumber = "250-700-389";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate23 = 133.93;
			double hoursWorkedInAWeek23 = 15.00; 
			double grossWeeklySalary23 = hourlyRate23*hoursWorkedInAWeek23; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate23); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek23); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary23);
		break;
		
		case 10024:

			//inputs
			employeeName = "Emelia Maceda";
			birthDate = "4/14/1963";
			address = "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija";
			phoneNumber = "973-358-041";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate24 = 133.93;
			double hoursWorkedInAWeek24 = 16.00; 
			double grossWeeklySalary24 = hourlyRate24*hoursWorkedInAWeek24; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate24); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek24); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary24);
		break;
		
		case 10025:

			//inputs
			employeeName = "Delia Aguilar";
			birthDate = "1/27/1939";
			address = "95 Cremin Junction, Surallah 2809 Cotabato";
			phoneNumber = "529-705-439";
			basicSalary = 22500;
			grossSemiMR = 11250;
			double hourlyRate25 = 133.93;
			double hoursWorkedInAWeek25 = 16.00; 
			double grossWeeklySalary25 = hourlyRate25*hoursWorkedInAWeek25; //HourlyRate is multiplied by HoursWorkedInAWeek to get the GrossWeeklySalary

			System.out.println("Employee Name                                 : "+employeeName); // Employees Name
			System.out.println("Birth Date                                    : "+birthDate); // Employees Date of Birth
			System.out.println("Address                                       : "+address); // Employees Address
			System.out.println("Phone Number                                  : "+phoneNumber); // Employees Number

			System.out.println("Basic Salary                                  : "+basicSalary); // Employees Salary 

			System.out.println("Hourly Rate                                   : "+hourlyRate25); // Employees Hourly Rate 
			System.out.println();
			System.out.println("Hours Worked 1st Week of Dec                  : "+hoursWorkedInAWeek25); //Hours Worked In a Week 1 on December
			System.out.println("Gross Weekly Salary                           : "+grossWeeklySalary25);
		break;
		
		
		}
	}
	
}
