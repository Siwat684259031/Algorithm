public class VariableExample {
    public static void main(String[] args) {
        //1.1 ตัวแปรที่ใช้เก็บค่าของขนาดของเสื้อผ้า ซึ่งมีขนานเป็น s, m หรือ l
        char clothingSize = 's'; // สามารถเป็น 's', 'm' หรือ 'l'

        //1.2 ตัวแปรที่ใช้เก็บค่าจำนวนคนที่เข้ามาชมเว็บไซต์
        int websiteVisitors = 0; // จำนวนคนที่เข้าชมเว็บไซต์

        //1.3 ตัวแปรที่ใช้เก็บเกรดของนักศึกษา (A, B, C, D, E)
        char studentGrade = 'A'; // สามารถเป็น 'A', 'B', 'C', 'D', หรือ 'E'

        //1.4 ตัวแปรที่เก็บเกรดเฉลี่ยของนักศึกษา
        double studentGPA = 4.0; // ค่าเกรดเฉลี่ยของนักศึกษา

        //1.5 ตัวแปรที่เก็บค่าของ π (Pi - ค่าที่ใช้ในการหาเส้นรอบวงและพื้นที่วงกลม)
        final double PI = 3.14159; // ค่าของ Pi เป็นค่าคงที่

        //1.6 ตัวแปรที่ใช้เก็บค่าใช้จ่ายรายปีของนักศึกษา
        float annualExprnses = 15000.00f; // ค่าใช้จ่ายรายปีของนักศึกษา

        //1.7 ตัวแปรที่ใช้เก็บค่าจำนวนของเดือนที่มีในหนึ่งปี
        final int MOTHS_IN_YEAR = 12; // จำนวนเดือนในหนึ่งปี ควรเป็นค่าคงที่

        //ตัวอย่างการแสดงผลค่าตัวแปร
        System.out.println("Clothing Size: " + clothingSize);
        System.out.println("Website Visitors: " + websiteVisitors);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Value of Pi: " + PI);
        System.out.println("Annual Exprnses: " + annualExprnses);
        System.out.println("Months in a Year: " + MOTHS_IN_YEAR);
    }
}