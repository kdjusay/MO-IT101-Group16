package motorPH;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String employeeName, birthDate, address, phoneNumber, sss, philHealth, 
		tin, pagIbig, status, position, iSupervisor;
		
		int employeeNumber,basicSalary, riceSubsidy, pAllowance, cAllowance, grossSemiMR;
		
		double hourlyRate;
				
		
		System.out.print("Enter Employee Number: ");
		employeeNumber = input.nextInt();
		input.close();
		
		switch (employeeNumber){ 
			case 10001:
			
					employeeName = "Jose Crisostomo";
					birthDate = "2/14/1988";
					address = "17/85 Stracke Via Suite 042, Poblacion, Las Pinas 4783 Dinagat Islands";
					phoneNumber = "918-621-603";
					sss = "49-1632020-8";
					philHealth = "382189453145";
					tin = "317-674-022-000";
					pagIbig = "441093369646";
					status = "Regular";
					position = "HR Manager";
					iSupervisor = "N/A";
					basicSalary = 62670;
					riceSubsidy = 1500;
					pAllowance = 1000;
					cAllowance = 1000;
					grossSemiMR = 31335;
					hourlyRate = 373.04;
					double timeIn = 8.00;
					double timeOut = 17.00;
					double breaktime = 1.00;
					double hoursWorked = timeOut-timeIn-breaktime;

					System.out.println("Employee Name                  : "+employeeName);
					System.out.println("Birth Date                     : "+birthDate);
					System.out.println("Address                        : "+address);
					System.out.println("Phone Number                   : "+phoneNumber);
					System.out.println("SSS #                          : "+sss);
					System.out.println("PhilHealth #                   : "+philHealth);
					System.out.println("Tin #                          : "+tin);
					System.out.println("Pag-Ibig #                     : "+pagIbig);
					System.out.println("Status                         : "+status);
					System.out.println("Position                       : "+position);
					System.out.println("Immediate Supervisor           : "+iSupervisor);
					System.out.println("Basic Salary                   : "+basicSalary);
					System.out.println("Rice Subsidy                   : "+riceSubsidy);
					System.out.println("Phone Allowance                : "+pAllowance);
					System.out.println("Clothing Allowance             : "+cAllowance);
					System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
					System.out.println("Hourly Rate                    : "+hourlyRate);
					System.out.println();
					System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked);
		
			if(hoursWorked>=8) 
			{
				System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
			}
			else {
				System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
			}
			break;
		
			case 10002:
				
				employeeName = "Christian Mata";
				birthDate = "10/21/1987";
				address = "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu ";
				phoneNumber = "783-776-744";
				sss = "49-2959312-6";
				philHealth = "824187961962";
				tin = "103-100-522-000";
				pagIbig = "631052853464";
				status = "Regular";
				position = "Account Team Leader";
				iSupervisor = "Romualdez, Fredrick";
				basicSalary = 42975;
				riceSubsidy = 1500;
				pAllowance = 800;
				cAllowance = 800;
				grossSemiMR = 21488;
				hourlyRate = 255.80;
				double timeIn2 = 8.00;
				double timeOut2 = 17.00;
				double breaktime2 = 1.00;
				double hoursWorked2 = timeOut2-timeIn2-breaktime2;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked2);
				
				if(hoursWorked2>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10003:
				
				employeeName = "Brad San Jose";
				birthDate = "3/15/1996";
				address = "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi";
				phoneNumber = "797-009-261";
				sss = "40-2400714-1";
				philHealth = "239192926939";
				tin = "672-474-690-000";
				pagIbig = "210850209964";
				status = "Regular";
				position = "HR Team Leader";
				iSupervisor = "Crisostomo, Jose";
				basicSalary = 42975;
				riceSubsidy = 1500;
				pAllowance = 800;
				cAllowance = 800;
				grossSemiMR = 21488;
				hourlyRate = 255.80;
				double timeIn3 = 8.00;
				double timeOut3 = 17.00;
				double breaktime3 = 1.00;
				double hoursWorked3 = timeOut3-timeIn3-breaktime3;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked3);
				
				if(hoursWorked3>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10004:
				
				employeeName = "Anthony Salcedo";
				birthDate = "9/14/1993";
				address = "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate";
				phoneNumber = "070-766-300";
				sss = "26-9647608-3";
				philHealth = "126445315651";
				tin = "210-805-911-000";
				pagIbig = "218002473454";
				status = "Regular";
				position = "Payroll Manager";
				iSupervisor = "Crisostomo, Jose";
				basicSalary = 60825;
				riceSubsidy = 1500;
				pAllowance = 1000;
				cAllowance = 1000;
				grossSemiMR = 30413;
				hourlyRate = 362.05;
				double timeIn4 = 8.00;
				double timeOut4 = 17.00;
				double breaktime4 = 1.00;
				double hoursWorked4 = timeOut4-timeIn4-breaktime4;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked4);
				
				if(hoursWorked4>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10005:
				
				employeeName = "Alice Romualdez";
				birthDate = "5/14/1992";
				address = "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte";
				phoneNumber = "983-606-799";
				sss = "55-4476527-2";
				philHealth = "545652640232";
				tin = "888-572-294-000";
				pagIbig = "211385556888";
				status = "Regular";
				position = "HR Rank and File";
				iSupervisor = "San Jose, Brad";
				basicSalary = 22500;
				riceSubsidy = 1500;
				pAllowance = 500;
				cAllowance = 500;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn5 = 8.00;
				double timeOut5 = 17.00;
				double breaktime5 = 1.00;
				double hoursWorked5 = timeOut5-timeIn5-breaktime5;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked5);
				
				if(hoursWorked5>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10006:
				
				employeeName = "Rosie Atienza";
				birthDate = "9/24/1948";
				address = "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte";
				phoneNumber = "266-036-427";
				sss = "41-0644692-3";
				philHealth = "708988234853";
				tin = "604-997-793-000";
				pagIbig = "260107732354";
				status = "Regular";
				position = "HR Rank and File";
				iSupervisor = "San Jose, Brad";
				basicSalary = 22500;
				riceSubsidy = 1500;
				pAllowance = 500;
				cAllowance = 500;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn6 = 8.00;
				double timeOut6 = 17.00;
				double breaktime6 = 1.00;
				double hoursWorked6 = timeOut6-timeIn6-breaktime6;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked6);
				
				if(hoursWorked6>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10007:
				
				employeeName = "Martha Farala";
				birthDate = "1/11/1942";
				address = "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte";
				phoneNumber = "329-034-366";
				sss = "45-5656375-0";
				philHealth = "233693897247";
				tin = "210-835-851-000";
				pagIbig = "631130283546";
				status = "Regular";
				position = "Payroll Rank and File";
				iSupervisor = "Farala, Martha";
				basicSalary = 24000;
				riceSubsidy = 1500;
				pAllowance = 500;
				cAllowance = 500;
				grossSemiMR = 12000;
				hourlyRate = 142.86;
				double timeIn7 = 8.27;
				double timeOut7 = 17.00;
				double breaktime7 = 1.00;
				double hoursWorked7 = timeOut7-timeIn7-breaktime7;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked7);
				
				if(hoursWorked7>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10008:
				
				employeeName = "Leila Martinez";
				birthDate = "7/11/1970";
				address = "37/46 Kulas Roads, Maragondon 0962 Quirino";
				phoneNumber = "877-110-749";
				sss = "27-2090996-4";
				philHealth = "515741057496";
				tin = "275-792-513-000";
				pagIbig = "101205445886";
				status = "Regular";
				position = "Payroll Rank and File";
				iSupervisor = "Farala, Martha";
				basicSalary = 24000;
				riceSubsidy = 1500;
				pAllowance = 500;
				cAllowance = 500;
				grossSemiMR = 12000;
				hourlyRate = 142.86;
				double timeIn8 = 8.01;
				double timeOut8 = 17.00;
				double breaktime8 = 1.00;
				double hoursWorked8 = timeOut8-timeIn8-breaktime8;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked8);
				
				if(hoursWorked8>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10009:
				
				employeeName = "Allison San Jose";
				birthDate = "6/24/1986";
				address = "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union";
				phoneNumber = "179-075-129";
				sss = "45-3251383-0";
				philHealth = "745148459521";
				tin = "121-203-336-000";
				pagIbig = "114901859343";
				status = "Regular";
				position = "Account Rank and File";
				iSupervisor = "Mata, Christian";
				basicSalary = 22500;
				riceSubsidy = 1500;
				pAllowance = 500;
				cAllowance = 500;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn9 = 8.05;
				double timeOut9 = 17.00;
				double breaktime9 = 1.00;
				double hoursWorked9 = timeOut9-timeIn9-breaktime9;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked9);
				
				if(hoursWorked9>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10010:
				
				employeeName = "Cydney Rosario";
				birthDate = "10/6/1996";
				address = "93A/21 Berge Points, Tapaz 2180 Quezon";
				phoneNumber = "868-819-912";
				sss = "49-1629900-2";
				philHealth = "579253435499";
				tin = "122-244-511-000";
				pagIbig = "265104358643";
				status = "Regular";
				position = "Account Rank and File";
				iSupervisor = "Mata, Christian";
				basicSalary = 22500;
				riceSubsidy = 1500;
				pAllowance = 500;
				cAllowance = 500;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn10 = 8.00;
				double timeOut10 = 17.00;
				double breaktime10 = 1.00;
				double hoursWorked10 = timeOut10-timeIn10-breaktime10;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked10);
				
				if(hoursWorked10>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10011:
				
				employeeName = "Josie Lopez";
				birthDate = "1/14/1937";
				address = "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro";
				phoneNumber = "478-355-427";
				sss = "44-8563448-3";
				philHealth = "431709011012";
				tin = "218-489-737-000";
				pagIbig = "113071293354";
				status = "Regular";
				position = "Payroll Team Leader";
				iSupervisor = "Salcedo, Anthony";
				basicSalary = 38475;
				riceSubsidy = 1500;
				pAllowance = 800;
				cAllowance = 800;
				grossSemiMR = 19238;
				hourlyRate = 229.02;
				double timeIn11 = 8.00;
				double timeOut11 = 17.00;
				double breaktime11 = 1.00;
				double hoursWorked11 = timeOut11-timeIn11-breaktime11;

				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked11);
				
				if(hoursWorked11>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10012:
				
				employeeName = "Selena De Leon";
				birthDate = "2/20/1945";
				address = "89A Armstrong Trace, Compostela 7874 Maguindanao";
				phoneNumber = "975-432-139";
				sss = "27-2090208-8";
				philHealth = "587272469938";
				tin = "482-259-498-000";
				pagIbig = "719007608464";
				status = "Regular";
				position = "Account Team Leader";
				iSupervisor = "Romualdez, Fredrick";
				basicSalary = 41850;
				riceSubsidy = 1500;
				pAllowance = 800;
				cAllowance = 800;
				grossSemiMR = 20925;
				hourlyRate = 249.11;
				double timeIn12 = 8.00;
				double timeOut12 = 17.00;
				double breaktime12 = 1.00;
				double hoursWorked12 = timeOut12-timeIn12-breaktime12;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked12);
				
				if(hoursWorked12>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10013:
				
				employeeName = "Fredrick Romualdez";
				birthDate = "3/10/1985";
				address = "22A/52 Lubowitz Meadows, Pililla 4895 Zambales";
				phoneNumber = "023-079-009";
				sss = "26-8768374-1";
				philHealth = "308366860059";
				tin = "598-065-761-000";
				pagIbig = "223057707853";
				status = "Regular";
				position = "Account Manager";
				iSupervisor = "Crisostomo, Jose";
				basicSalary = 63500;
				riceSubsidy = 1500;
				pAllowance = 1000;
				cAllowance = 1000;
				grossSemiMR = 31750;
				hourlyRate = 377.98;
				double timeIn13 = 8.00;
				double timeOut13 = 17.00;
				double breaktime13 = 1.00;
				double hoursWorked13 = timeOut13-timeIn13-breaktime13;

				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked13);
				
				if(hoursWorked13>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10014:
				
				employeeName = "Mark Bautista";
				birthDate = "2/12/1961";
				address = "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino";
				phoneNumber = "683-725-348";
				sss = "49-1647342-5";
				philHealth = "399665157135";
				tin = "273-970-941-000";
				pagIbig = "260054585575";
				status = "Regular";
				position = "Account Rank and File";
				iSupervisor = "Mata, Christian";
				basicSalary = 23250;
				riceSubsidy = 1500;
				pAllowance = 500;
				cAllowance = 500;
				grossSemiMR = 11625;
				hourlyRate = 138.39;
				double timeIn14 = 8.00;
				double timeOut14 = 17.00;
				double breaktime14 = 1.00;
				double hoursWorked14 = timeOut14-timeIn14-breaktime14;

				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked14);
				
				if(hoursWorked14>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10015:
				
				employeeName = "Darlene Lazaro";
				birthDate = "11/25/1985";
				address = "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino";
				phoneNumber = "740-721-558";
				sss = "45-5617168-2";
				philHealth = "606386917510";
				tin = "354-650-951-000";
				pagIbig = "104907708845";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "Mata, Christian";
				basicSalary = 23250;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 11625;
				hourlyRate = 138.39;
				double timeIn15 = 8.00;
				double timeOut15 = 17.00;
				double breaktime15 = 1.00;
				double hoursWorked15 = timeOut15-timeIn15-breaktime15;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked15);
				
				if(hoursWorked15>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10016:
				
				employeeName = "Kolby Delos Santos";
				birthDate = "2/26/1980";
				address = "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur";
				phoneNumber = "739-443-033";
				sss = "52-0109570-6";
				philHealth = "357451271274";
				tin = "187-500-345-000";
				pagIbig = "113017988667";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "Mata, Christian";
				basicSalary = 24000;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 12000;
				hourlyRate = 142.86;
				double timeIn16 = 8.28;
				double timeOut16 = 17.00;
				double breaktime16 = 1.00;
				double hoursWorked16 = timeOut16-timeIn16-breaktime16;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked16);
				
				if(hoursWorked16>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10017:
				
				employeeName = "Vella Santos";
				birthDate = "12/31/1983";
				address = "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur";
				phoneNumber = "955-879-269";
				sss = "52-9883524-3";
				philHealth = "548670482885";
				tin = "101-558-994-000";
				pagIbig = "360028104576";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "Mata, Christian";
				basicSalary = 22500;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn17 = 8.00;
				double timeOut17 = 17.00;
				double breaktime17 = 1.00;
				double hoursWorked17 = timeOut17-timeIn17-breaktime17;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked17);
				
				if(hoursWorked17>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10018:
				
				employeeName = "Tomas Del Rosario";
				birthDate = "12/18/1978";
				address = "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque";
				phoneNumber = "882-550-989";
				sss = "45-5866331-6";
				philHealth = "953901539995";
				tin = "560-735-732-000";
				pagIbig = "913108649964";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "Mata, Christian";
				basicSalary = 22500;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn18 = 8.00;
				double timeOut18 = 17.00;
				double breaktime18 = 1.00;
				double hoursWorked18 = timeOut18-timeIn18-breaktime18;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked18);
				
				if(hoursWorked18>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10019:
				
				employeeName = "Jacklyn Tolentino";
				birthDate = "5/19/1944";
				address = "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao";
				phoneNumber = "675-757-366";
				sss = "47-1692793-0";
				philHealth = "753800654114";
				tin = "841-177-857-000";
				pagIbig = "210546661243";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "De Leon, Selena";
				basicSalary = 24000;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 12000;
				hourlyRate = 142.86;
				double timeIn19 = 8.00;
				double timeOut19 = 17.00;
				double breaktime19 = 1.00;
				double hoursWorked19 = timeOut19-timeIn19-breaktime19;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked19);
				
				if(hoursWorked19>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10020:
				
				employeeName = "Percival Gutierrez";
				birthDate = "12/18/1970";
				address = "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur";
				phoneNumber = "512-899-876";
				sss = "40-9504657-8";
				philHealth = "797639382265";
				tin = "502-995-671-000";
				pagIbig = "210897095686";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "De Leon, Selena";
				basicSalary = 24750;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 12375;
				hourlyRate = 147.32;
				double timeIn20 = 8.00;
				double timeOut20 = 17.00;
				double breaktime20 = 1.00;
				double hoursWorked20 = timeOut20-timeIn20-breaktime20;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked20);
				
				if(hoursWorked20>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10021:	
				
				employeeName = "Garfield Manalaysay";
				birthDate = "8/28/1966";
				address = "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur";
				phoneNumber = "948-628-136";
				sss = "45-3298166-4";
				philHealth = "810909286264";
				tin = "336-676-445-000";
				pagIbig = "211274476563";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "De Leon, Selena";
				basicSalary = 24750;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 12375;
				hourlyRate = 147.32;
				double timeIn21 = 8.11;
				double timeOut21 = 17.00;
				double breaktime21 = 1.00;
				double hoursWorked21 = timeOut21-timeIn21-breaktime21;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked21);
				
				if(hoursWorked21>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10022:
				
				employeeName = "Lizeth Villegas";
				birthDate = "12/12/1981";
				address = "66/77 Mann Views, Luisiana 1263 Dinagat Islands";
				phoneNumber = "332-372-215";
				sss = "40-2400719-4";
				philHealth = "934389652994";
				tin = "210-395-397-000";
				pagIbig = "122238077997";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "De Leon, Selena";
				basicSalary = 24000;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 12000;
				hourlyRate = 142.86;
				double timeIn22 = 8.00;
				double timeOut22 = 17.00;
				double breaktime22 = 1.00;
				double hoursWorked22 = timeOut22-timeIn22-breaktime22;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked22);
				
				if(hoursWorked22>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10023:
				
				employeeName = "Carol Ramos";
				birthDate = "8/20/1978";
				address = "72/70 Stamm Spurs, Bustos 4550 Iloilo";
				phoneNumber = "250-700-389";
				sss = "60-1152206-4";
				philHealth = "351830469744";
				tin = "395-032-717-000";
				pagIbig = "212141893454";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "De Leon, Selena";
				basicSalary = 22500;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn23 = 8.00;
				double timeOut23 = 17.00;
				double breaktime23 = 1.00;
				double hoursWorked23 = timeOut23-timeIn23-breaktime23;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked23);
				
				if(hoursWorked23>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10024:
				
				employeeName = "Emelia Maceda";
				birthDate = "4/14/1963";
				address = "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija";
				phoneNumber = "973-358-041"; 
				sss = "54-1331005-0";
				philHealth = "465087894112";
				tin = "215-973-013-000";
				pagIbig = "515012579765";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "De Leon, Selena";
				basicSalary = 22500;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn24 = 8.21;
				double timeOut24 = 17.00;
				double breaktime24 = 1.00;
				double hoursWorked24 = timeOut24-timeIn24-breaktime24;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked24);
				
				if(hoursWorked24>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				
			case 10025:
				
				employeeName = "Delia Aguilar";
				birthDate = "1/27/1939";
				address = "95 Cremin Junction, Surallah 2809 Cotabato";
				phoneNumber = "529-705-439";
				sss = "52-1859253-1";
				philHealth = "136451303068";
				tin = "599-312-588-000";
				pagIbig = "110018813465";
				status = "Probationary";
				position = "Account Rank and File";
				iSupervisor = "De Leon, Selena";
				basicSalary = 22500;
				riceSubsidy = 0;
				pAllowance = 0;
				cAllowance = 0;
				grossSemiMR = 11250;
				hourlyRate = 133.93;
				double timeIn25 = 8.00;
				double timeOut25 = 17.00;
				double breaktime25 = 1.00;
				double hoursWorked25 = timeOut25-timeIn25-breaktime25;
				
				System.out.println("Employee Name                  : "+employeeName);
				System.out.println("Birth Date                     : "+birthDate);
				System.out.println("Address                        : "+address);
				System.out.println("Phone Number                   : "+phoneNumber);
				System.out.println("SSS #                          : "+sss);
				System.out.println("PhilHealth #                   : "+philHealth);
				System.out.println("Tin #                          : "+tin);
				System.out.println("Pag-Ibig #                     : "+pagIbig);
				System.out.println("Status                         : "+status);
				System.out.println("Position                       : "+position);
				System.out.println("Immediate Supervisor           : "+iSupervisor);
				System.out.println("Basic Salary                   : "+basicSalary);
				System.out.println("Rice Subsidy                   : "+riceSubsidy);
				System.out.println("Phone Allowance                : "+pAllowance);
				System.out.println("Clothing Allowance             : "+cAllowance);
				System.out.println("Gross Semi-monthly Rate        : "+grossSemiMR);
				System.out.println("Hourly Rate                    : "+hourlyRate);
				System.out.println();
				System.out.println("Hours Worked on 01/09/2022     : "+hoursWorked25);
				
				if(hoursWorked25>=8) 
				{
					System.out.println("You've Completed 8 Hours of Work for 01/09/2022");
				}
				else {
					System.out.println("You didn't complete 8 Hours of Worked for 01/09/2022");
				}
				break;
				default:
					System.out.println("Invalid Employee Number");
				
	 }	
	}

}
