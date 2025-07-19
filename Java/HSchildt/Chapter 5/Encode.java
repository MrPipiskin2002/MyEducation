class Encode {
 	public static void main(String[] args) {
 		String msg = "This is a test";
 		String encmsg = "";
 		String decmsg = "";
 		String key = "HiNigger";
		char symbol = (char) 0;
 		System.out.print("Исходное сообщение: ");
 		System.out.println(msg);
 		// Закодировать сообщение,
 		for(int i=0; i < msg.length(); i++) {
			symbol = (char) msg.charAt(i);
			for(int j = 0; j < key.length(); j++)
 				symbol ^= key.charAt(j);
			encmsg = encmsg + (char) symbol;
		}
 		System.out.print("Закодированное сообщение: ");
 		System.out.println(encmsg);
 		// Декодировать сообщение.
 		for(int i=0; i < encmsg.length(); i++) {
			symbol = (char) encmsg.charAt(i);
 			for(int j = key.length()-1; j > -1; j--)
 				symbol ^= key.charAt(j);
			decmsg = decmsg + (char) symbol;
		}
 		System.out.print("Декодированное сообщение: ");
 		System.out.println(decmsg);
 	}
 }