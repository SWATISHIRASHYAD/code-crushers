public String create() {
System.out.println("enter usn");
String usn = sc.next();
File file1 = new File("C:\\myjava\\myjavafiles"+usn+".txt");
return usn;
}
public static boolean isvalidnumber(String number){
return number.matches("[\\d+\\-\\s()]*");
}
