package com.bellevue.moduleSix;

public class UseDivision {
    public static void main(String[] args) {
        DomesticDivision domDiv1 = new DomesticDivision("ACI Auburn", 9000, "AL");
        DomesticDivision domDiv2 = new DomesticDivision("ACI Omaha", 514351, "NE");
        InternationalDivision intDiv1 = new InternationalDivision("ACI Pune", 213134, "India", "Indian");
        InternationalDivision intDiv2 = new InternationalDivision("ACI Tokyo", 45252524, "Japan", "Japanese");
        domDiv1.display();
        domDiv2.display();
        intDiv1.display();
        intDiv2.display();
    }
}
