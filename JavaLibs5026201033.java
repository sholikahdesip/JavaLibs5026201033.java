import javax.swing.JOptionPane;

public class JavaLibs5026201033 {
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,
				"Hai, makin cakep aja nih");
				"Kali ini aku mau ajak kamu liburan nih" ;
				"LiburanKuy" ;
				1 ;		
			
		String name = (String)JOptionPane.showInputDialog(null,
			"Hi! Perkenalan dulu yuk! Nama kamu siapa?",
			"LiburanKuy",
			2,
			null,
			null,
			"Desi") ;
				
		String place = (String)JOptionPane.showInputDialog(null,
			"Nenek kamu lahir di kota mana?",
			"LiburanKuy",
			2,
			null,
			null,
			"Madiun") ;
				
		String nameIdol = (String)JOptionPane.showInputDialog(null,
			"Kamu mengidolakan siapa kalau sudah tua nanti?",
			"LiburanKuy",
			2,
			null,
			null,
			"Bambang") ;
				
		String[] acceptableValues = {"bakso", "roti", "tahu"};
		String food = (String)JOptionPane.showInputDialog(null,
			name + " yang bukan makanan favorit nya mana?",
			"LiburanKuy",
			2,
			null,
			null,
			"tahu") ;
				
		String drink = (String)JOptionPane.showInputDialog(null,
			"Habis makan itu paling ga cocok sambil minum?",
			"LiburanKuy",
			2,
			null,
			null,
			"Es Teh") ;
				
				
		String animal = (String)JOptionPane.showInputDialog(null,
			name + " suka sama hewan apa nih?",
			"LiburanKuy",
			2,
			null,
			null,
			"Serigala") ;
		
		String ear = (String)JOptionPane.showInputDialog(null,
			"Kamu punya berapa telinga sih?",
			"LiburanKuy",
			2,
			null,
			null,
			"2") ;
			
		int kid = Integer.parseInt(ear);
		kid++;
		
		String cartoon = (String)JOptionPane.showInputDialog(null,
			"Kalau di rumah suka nonton kartun apa?",
			"LiburanKuy",
			2,
			null,
			null,
			"Dora") ;
			
		String day = (String)JOptionPane.showInputDialog(null,
			"Kamu terakhir mandi hari apa?",
			"LiburanKuy",
			2,
			null,
			null,
			"Senin") ;
		
		String date = (String)JOptionPane.showInputDialog(null,
			day + "itu tanggal berapa?",
			"LiburanKuy",
			2,
			null,
			null,
			"30") ;
			
		double match = Double.parseDouble(date);
		match++;
		
		String time= (String)JOptionPane.showInputDialog(null,
			"Kamu besok bangun tidur jam berapa?",
			"LiburanKuy",
			2,
			null,
			null,
			"12.00") ;
			
		JOptionPane.showMessageDialog(null,
				"Gimana nih, masa ga capek sih rebahan mulu",
			"Jangan lupain pesan, kesannya yaa!",
			"LiburanKuy",
			1);
				
		JOptionPane.showMessageDialog(null,
				"Hi! " + name + " \n"
			+ "\nKenalin kami dari pihak tempat wisata " + place + " \n"
			+ "\nKami mau mengajak kamu liburan nih "
			+ "\nKamu pasti bertanya-tanya nama ku kan! "
			+ "\nJadi namaku itu " + nameIdol + " salam kenal yaa \n"
			+ "\nOh ya kamu pasti suka makan " + food + " \n"
			+ "\nDan sambil minum " + drink + " \n"
			+ "\nDenger denger, kamu itu sejenis " + animal + " \n"
			+ "\nNah kebetulan banget kan, " + name + " \n"
			+ "\nItu yang kami cari. Kami juga menyediakan itu semua untuk kamu nih "
			+ "\nApalagi kalau kamu mengajak teman cewek " + ear + " \n"
			+ "\nKamu pasti banyak diskon nih! "
			+ "\nDan kalau kamu mengajak teman yang bernama " + cartoon + " \n"
			+ "\nakan kami gratisin dehh "
			+ "\nPromo ini berlaku sampai hari " + day + " \n"
			+ "\nTanggal " + date + " \n"
			+ "\npada pukul " + time + " \n"
			+ "\nJadi jangan sampai ketinggalan yaa "
			+ "\nLangsung cuss aja yuk! ",
			" Happy LiburanKuy ",
			1) ;
	}
}		