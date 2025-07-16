// 1)  *** create a java file name as Dbutil and same as class ***

//package com.sunbeam.mobilestore.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DbUtil {
//	private static final String URL = "jdbc:mysql://localhost:3306/classwork_db";
//	private static final String USERNAME = "manager";
//	private static final String PASSWORD = "manager";
//
//	public static Connection getConnection() throws SQLException {
//		return DriverManager.getConnection(URL, USERNAME, PASSWORD);
//	}
//}


// 2) *** ceate a java file name as mobule and same as class ***

//package com.sunbeam.mobilestore.entity;
//
//import java.util.Scanner;
//
//public class Mobule {
//	private int mobileid;
//	private String company;
//	private String model;
//	private double price;
//
//	public Mobule() {
//	}
//
//	public Mobule(int mobileid, String company, String model, double price) {
//		this.mobileid = mobileid;
//		this.company = company;
//		this.model = model;
//		this.price = price;
//	}
//
//	public int getMobileid() {
//		return mobileid;
//	}
//
//	public void setMobileid(int mobileid) {
//		this.mobileid = mobileid;
//	}
//
//	public String getCompany() {
//		return company;
//	}
//
//	public void setCompany(String company) {
//		this.company = company;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	@Override
//	public String toString() {
//		return "[mobileid=" + mobileid + ", company=" + company + ", model=" + model + ", price=" + price + "]";
//	}
//
//	public void accept(Scanner sc) {
//		System.out.print("Enter the company - ");
//		company = sc.next();
//		System.out.print("Enter the model - ");
//		model = sc.next();
//		System.out.print("Enter the price - ");
//		price = sc.nextDouble();
//	}
//}

// 3) *** ceate a java file name as user and same as class ***

//package com.sunbeam.mobilestore.entity;
//
//import java.util.Scanner;
//
//public class User {
//	private int userid;
//	private String name;
//	private String email;
//	private String password;
//	private String city;
//
//	public User() {
//	}
//
//	public User(int userid, String name, String email, String password, String city) {
//		this.userid = userid;
//		this.name = name;
//		this.email = email;
//		this.password = password;
//		this.city = city;
//	}
//
//	public int getUserid() {
//		return userid;
//	}
//
//	public void setUserid(int userid) {
//		this.userid = userid;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public void accept(Scanner sc) {
//		System.out.print("Enter the user name - ");
//		name = sc.next();
//		System.out.print("Enter the email- ");
//		email = sc.next();
//		System.out.print("Enter the password - ");
//		password = sc.next();
//		System.out.print("Enter the city- ");
//		city = sc.next();
//	}
//
//	@Override
//	public String toString() {
//		return "User [userid=" + userid + ", name=" + name + ", email=" + email + ", password=" + password + ", city="
//				+ city + "]";
//	}
//}

//  4) *** create a main file name as rogram and same name as class 

//package com.sunbeam.mobilestore.mainmenu;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//import com.sunbeam.mobilestore.entity.Mobule;
//import com.sunbeam.mobilestore.entity.User;
//import com.sunbeam.mobilestore.util.DbUtil;
//
//public class Program {
//
//	private static void addUser(Scanner sc) {
//		User user = new User();
//		user.accept(sc);
//		
//		String sql = "INSERT INTO user(name , email , password , city ) VALUES(?,?,?,?)";
//		
//		try(Connection c = DbUtil.getConnection()) {
//			try(PreparedStatement statement = c.prepareStatement(sql)) {
//				statement.setString(1, user.getName());
//				statement.setString(2, user.getEmail());
//				statement.setString(3, user.getPassword());
//				statement.setString(4, user.getCity());
//				statement.executeUpdate();
//				System.out.println("user regiser successfully.....");
//			}
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private static void addMobile(Scanner sc) {
//		
//		Mobule mobile = new Mobule();
//		mobile.accept(sc);
//		
//		String sql = "INSERT INTO mobile ( company , model , price ) VALUES (?,?,?)";
//		
//		try(Connection c = DbUtil.getConnection()) {
//			try(PreparedStatement statement = c.prepareStatement(sql)) {
//				statement.setString(1, mobile.getCompany());
//				statement.setString(2, mobile.getModel());
//				statement.setDouble(3, mobile.getPrice());
//				statement.executeUpdate();
//				System.out.println("mobile add successfully....");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	private static void displayAllMobiles() {
//		
//		String sql = "SELECT * FROM mobile";
//		try(Connection c = DbUtil.getConnection()) {
//			try(PreparedStatement statement = c.prepareStatement(sql) ) {
//				ResultSet rs = statement.executeQuery();
//				
//				while(rs.next()) {
//					System.out.println("mobile id : " +rs.getInt(1));
//					System.out.println("company : " +rs.getString(2));
//					System.out.println("model : " +rs.getString(3));
//					System.out.println("price : " +rs.getDouble(4));
//					System.out.println("-------");
//					System.out.println();
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
//	
//	public static User loginUser(Scanner sc) {
//		User user = new User();
//		String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
//		System.out.print("Enter the email - ");
//		user.setEmail(sc.next());
//		System.out.print("Enter the password - ");
//		user.setPassword(sc.next());
//
//		try (Connection connection = DbUtil.getConnection()) {
//			try (PreparedStatement selectStatement = connection.prepareStatement(sql)) {
//				selectStatement.setString(1, user.getEmail());
//				selectStatement.setString(2, user.getPassword());
//				ResultSet rs = selectStatement.executeQuery();
//				if (rs.next()) {
//					user.setUserid(rs.getInt(1));
//					user.setName(rs.getString(2));
//					return user;
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
//
//	}
//
//
//	private static void placeOrder(Scanner sc , int userid )  {
//		
//		displayAllMobiles();
//		
//		String sql = "INSERT INTO orders(userid , mobileid ) VALUES (?,?)";
//		
//		System.out.println("enter the mobile id to purchase : ");
//		int mobileid = sc.nextInt();
//		try (Connection c = DbUtil.getConnection()){
//			try(PreparedStatement statement = c.prepareStatement(sql)){
//				
//				statement.setInt(1, userid);
//				statement.setInt(2, mobileid);
//				statement.executeUpdate();
//				System.out.println("YAYY ..... order placed");
//}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private static void orderHistory(int userid) {
//		String sql = "SELECT m.company,m.model,m.price FROM mobile m INNER JOIN orders o ON m.mobileid=o.mobileid WHERE o.userid=?";
//		try (Connection connection = DbUtil.getConnection()) {
//			try (PreparedStatement selectStatement = connection.prepareStatement(sql)) {
//				selectStatement.setInt(1, userid);
//				ResultSet rs = selectStatement.executeQuery();
//				while (rs.next()) {
//					System.out.print(rs.getString(1) + " - ");
//					System.out.print(rs.getString(2) + " - ");
//					System.out.print(rs.getDouble(3));
//					System.out.println();
//				}
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		User user = null;
//		int choice;
//		do {
//			
//			System.out.println("****************************");
//			System.out.println("0. EXIT");
//			System.out.println("1. Add User");
//			System.out.println("2. Add Mobile");
//			System.out.println("3. Display All Mobiles");
//			System.out.println("4. Login");
//			System.out.println("5. Place Order");
//			System.out.println("6. Order history");
//			System.out.println("7. Logout");
//			System.out.print("Enter the choice - ");
//			 choice = sc.nextInt();
//			System.out.println("****************************");
//			
//			switch (choice) {
//			case 1:
//				addUser(sc);
//				break;
//			case 2:
//				addMobile(sc);
//				break;
//			case 3:
//				displayAllMobiles();
//				break;
//			case 4:
//				user = loginUser(sc);
//				if (user != null)
//					System.out.println("Login Successsful...");
//				else
//					System.out.println("Invalid Credentials...");
//				break;
//			case 5:
//				if(user != null) {
//					placeOrder(sc , user.getUserid() );
//				}
//				else {
//					System.out.println("you need to login");
//				}
//				break;
//			case 6:
//				if (user != null)
//					orderHistory(user.getUserid());
//				else
//					System.out.println("You need to login...");
//				break;
//
//			case 7:
//				user = null;
//				System.out.println("Logout Successful...");
//				break;
//
//			default:
//				System.out.println("Wrong choice ... :(");
//				break;
//			}
//		}while(choice != 0);
//		sc.close();
//		
//		System.out.println("Thank you for using our app :)");
//	}
//
//}

