import javax.swing.JOptionPane;
public class tugas3 extends javax.swing.JFrame {
    public static void main(String[] args) {
        int p, l, a, t, s, s1, s2, s3, hasil;
        String jns;
        String jwb = "4";
        String jwb2 = "3";
        do {jwb = JOptionPane.showInputDialog
                    (null,
                            "1. Persegi \n2. Persegi Panjang \n3. Segitiga \n\nPilih Bangun Datar :",
                            "Program Menghitung Bangun Datar", JOptionPane.INFORMATION_MESSAGE);
            switch (jwb) {
                case "1":
                    jns = "Persegi";
                    do {
                        jwb2 = JOptionPane.showInputDialog
                                (null,
                                        "1. Hitung Luas " + jns + " \n2. Hitung Keliling " + jns + " \n\n Masukkan Pilihan :",
                                        "Program Menghitung " + jns, JOptionPane.INFORMATION_MESSAGE);
                    } while (jwb2.equals("") || Integer.parseInt(jwb2) > 2 || Integer.parseInt(jwb2) == 0);
                    if (Integer.parseInt(jwb2) == 1) {
                        s = Integer.parseInt(JOptionPane.showInputDialog("Input Panjang Sisi : (cm) "));
                        hasil = s * s;
                        JOptionPane.showMessageDialog(null, "Luas " + jns + " dengan sisi " + s + " cm adalah " + hasil + " cm");
                    } else if (Integer.parseInt(jwb2) == 2) {
                        s = Integer.parseInt(JOptionPane.showInputDialog("Input Panjang Sisi : (cm) "));
                        hasil = 4 * s;
                        JOptionPane.showMessageDialog(null, "Keliling " + jns + " dengan sisi " + s + " cm adalah " + hasil + " cm");
                    };
                    break;
                case "2":
                    jns = "Persegi Panjang";
                    do {
                        jwb2 = JOptionPane.showInputDialog
                                (null,
                                        "1. Hitung Luas " + jns + " \n2. Hitung Keliling " + jns + " \n\n Masukkan Pilihan :",
                                        "Program Menghitung " + jns, JOptionPane.INFORMATION_MESSAGE);
                    } while (jwb2.equals("") || Integer.parseInt(jwb2) > 2 || Integer.parseInt(jwb2) == 0);
                    if (Integer.parseInt(jwb2) == 1) {
                        p = Integer.parseInt(JOptionPane.showInputDialog("Input Panjang : (cm) "));
                        l = Integer.parseInt(JOptionPane.showInputDialog("Input Lebar : (cm) "));
                        hasil = p * l;
                        JOptionPane.showMessageDialog(null, "Luas " + jns + " adalah " + hasil + " cm");
                    } else if (Integer.parseInt(jwb2) == 2) {
                        p = Integer.parseInt(JOptionPane.showInputDialog("Input Panjang : (cm) "));
                        l = Integer.parseInt(JOptionPane.showInputDialog("Input Lebar : (cm) "));
                        hasil = 2 * (p + l);
                        JOptionPane.showMessageDialog(null, "Keliling " + jns + " adalah " + hasil + " cm");
                    }
                    ;
                    break;

                case "3":
                    jns = "Segitiga";
                    do {
                        jwb2 = JOptionPane.showInputDialog
                                (null,
                                        "1. Hitung Luas " + jns + " \n2. Hitung Keliling " + jns + " \n\n Masukkan Pilihan :",
                                        "Program Menghitung " + jns, JOptionPane.INFORMATION_MESSAGE);
                    } while (jwb2.equals("") || Integer.parseInt(jwb2) > 2 || Integer.parseInt(jwb2) == 0);
                    if (Integer.parseInt(jwb2) == 1) {
                        a = Integer.parseInt(JOptionPane.showInputDialog("Input Alas : (cm) "));
                        t = Integer.parseInt(JOptionPane.showInputDialog("Input Tinggi : (cm) "));
                        double hasil_s = 0.5 * a * t;
                        JOptionPane.showMessageDialog(null, "Luas " + jns + " adalah " + hasil_s + " cm");
                    } else if (Integer.parseInt(jwb2) == 2) {
                        s1 = Integer.parseInt(JOptionPane.showInputDialog("Input Sisi 1 : (cm) "));
                        s2 = Integer.parseInt(JOptionPane.showInputDialog("Input Sisi 2 : (cm) "));
                        s3 = Integer.parseInt(JOptionPane.showInputDialog("Input Sisi 3 : (cm) "));
                        hasil = s1 + s2 + s3;
                        JOptionPane.showMessageDialog(null, "Keliling " + jns + " adalah " + hasil + " cm");
                    }
                    ;
                    break;
            }
        } while (jwb.equals("") || Integer.parseInt(jwb) > 3 || Integer.parseInt(jwb) == 0);
    }
}
