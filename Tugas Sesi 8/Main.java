class bangunDatar {
    double a;
    double b;

    bangunDatar (double alas, double tinggi) {
        a = alas;
        b = tinggi;
    }

    public void hitungLuas() {
        double luas = a * b;
    }
}

class segitiga extends bangunDatar {
    segitiga (double alas, double tinggi) {
        super(alas, tinggi);
    }
    
    public void hitungLuas() {
        double luas = a * b / 2;
        System.out.println("Alas = " + a);
        System.out.println("Tinggi = " + b);
        System.out.println("Luas Segitiga = " + luas);
    }
}

class persegiPanjang extends bangunDatar {
    persegiPanjang (double panjang, double lebar) {
        super(panjang, lebar);
    }
    
    public void hitungLuas() {
        double luas = a * b;
        System.out.println("Panjang = " + a);
        System.out.println("Lebar = " + b);
        System.out.println("Luas Persegi Panjang = " + luas);
    }
}

public class Main {
    public static void main(String[] args) {
        segitiga triangle = new segitiga(3, 10);
        persegiPanjang rectangle = new persegiPanjang(5, 10);

        triangle.hitungLuas();
        rectangle.hitungLuas();
    }
}
