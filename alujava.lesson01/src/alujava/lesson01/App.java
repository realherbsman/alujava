package alujava.lesson01;

public class App {

	public static void main(String[] args) {

		double doubleVar = Double.longBitsToDouble(0b11000000_00000000_00000000_00000000_01100000_00000000_01000000_11000000L);
		float floatVar = Float.intBitsToFloat(0b01100000_00000000_01000000_11000000);
		long longVar = 0b11000000_00000000_00000000_00000000_01100000_00000000_01000000_11000000L;
		int intVar = 0b01100000_00000000_01000000_11000000;
		short shortVar = (short) 0b01000000_11000000;
		byte byteVar = (byte) 0b11000000;
		char charVar = (char) 0b01000000_11000000;
		boolean booleanVar = true;
		
		System.out.println("- = demo = -");
		System.out.println(String.format("%- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println(String.format("%- 30.20e\t%64s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		System.out.println(String.format("%- 30d\t%64s", longVar, Long.toBinaryString(longVar)));
		System.out.println(String.format("%- 30d\t%64s", intVar, Integer.toBinaryString(intVar)));
		System.out.println(String.format("%- 30d\t%64s", shortVar, Integer.toBinaryString(Short.toUnsignedInt(shortVar))));
		System.out.println(String.format("%- 30d\t%64s", byteVar, Integer.toBinaryString(Byte.toUnsignedInt(byteVar))));
		System.out.println(String.format("%c%25s\t%64s", charVar, "", Integer.toBinaryString(Short.toUnsignedInt((short)charVar))));
		System.out.println(String.format("%-30b", booleanVar));
		System.out.println("- = #### = -");
		
/**************************************************/
		doubleVar = Double.longBitsToDouble(0b11000000_00000000_00000000_00000000_01100000_00000000_01000000_11000000L);
		floatVar = (float) doubleVar;
		longVar = (long) doubleVar;
		intVar = (int) doubleVar;
		shortVar = (short) doubleVar;
		byteVar = (byte) doubleVar;
		charVar = (char) doubleVar;
		
		System.out.println("- = double = -");
		System.out.println(String.format("%- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println(String.format("%- 30.20e\t%64s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		System.out.println(String.format("%- 30d\t%64s", longVar, Long.toBinaryString(longVar)));
		System.out.println(String.format("%- 30d\t%64s", intVar, Integer.toBinaryString(intVar)));
		System.out.println(String.format("%- 30d\t%64s", shortVar, Integer.toBinaryString(Short.toUnsignedInt(shortVar))));
		System.out.println(String.format("%- 30d\t%64s", byteVar, Integer.toBinaryString(Byte.toUnsignedInt(byteVar))));
		System.out.println(String.format("%c%25s\t%64s", charVar, "", Integer.toBinaryString(Short.toUnsignedInt((short)charVar))));
		System.out.println("- = #### = -");

		
		/**************************************************/
		floatVar = Float.intBitsToFloat(0b01100000_00000000_01000000_11000000);
		
		doubleVar = floatVar;
		longVar = (long) floatVar;
		intVar = (int) floatVar;
		shortVar = (short) floatVar;
		byteVar = (byte) floatVar;
		charVar = (char) floatVar;
		
		System.out.println("- = float = -");
		System.out.println(String.format("%- 30.20e\t%64s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		
		System.out.println(String.format("%- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println(String.format("%- 30d\t%64s", longVar, Long.toBinaryString(longVar)));
		System.out.println(String.format("%- 30d\t%64s", intVar, Integer.toBinaryString(intVar)));
		System.out.println(String.format("%- 30d\t%64s", shortVar, Integer.toBinaryString(Short.toUnsignedInt(shortVar))));
		System.out.println(String.format("%- 30d\t%64s", byteVar, Integer.toBinaryString(Byte.toUnsignedInt(byteVar))));
		System.out.println(String.format("%c%25s\t%64s", charVar, "", Integer.toBinaryString(Short.toUnsignedInt((short)charVar))));
		System.out.println("- = #### = -");		
		
		/**************************************************/
		longVar = 0b11000000_00000000_00000000_00000000_01100000_00000000_01000000_11000000L;
		
		doubleVar = longVar;
		floatVar = longVar;
		intVar = (int) longVar;
		shortVar = (short) longVar;
		byteVar = (byte) longVar;
		charVar = (char) longVar;
		
		System.out.println("- = long = -");
		System.out.println(String.format("%- 30d\t%64s", longVar, Long.toBinaryString(longVar)));
		
		System.out.println(String.format("%- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println(String.format("%- 30.20e\t%64s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		System.out.println(String.format("%- 30d\t%64s", intVar, Integer.toBinaryString(intVar)));
		System.out.println(String.format("%- 30d\t%64s", shortVar, Integer.toBinaryString(Short.toUnsignedInt(shortVar))));
		System.out.println(String.format("%- 30d\t%64s", byteVar, Integer.toBinaryString(Byte.toUnsignedInt(byteVar))));
		System.out.println(String.format("%c%25s\t%64s", charVar, "", Integer.toBinaryString(Short.toUnsignedInt((short)charVar))));
		System.out.println("- = #### = -");	
		
		/**************************************************/
		intVar = 0b01100000_00000000_01000000_11000000;
		
		doubleVar = intVar;
		floatVar = intVar;
		longVar = intVar;
		shortVar = (short) intVar;
		byteVar = (byte) intVar;
		charVar = (char) intVar;
		
		System.out.println("- = int = -");
		System.out.println(String.format("%- 30d\t%64s", intVar, Integer.toBinaryString(intVar)));
		
		System.out.println(String.format("%- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println(String.format("%- 30.20e\t%64s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		System.out.println(String.format("%- 30d\t%64s", longVar, Long.toBinaryString(longVar)));
		System.out.println(String.format("%- 30d\t%64s", shortVar, Integer.toBinaryString(Short.toUnsignedInt(shortVar))));
		System.out.println(String.format("%- 30d\t%64s", byteVar, Integer.toBinaryString(Byte.toUnsignedInt(byteVar))));
		System.out.println(String.format("%c%25s\t%64s", charVar, "", Integer.toBinaryString(Short.toUnsignedInt((short)charVar))));
		System.out.println("- = #### = -");	
		
		/**************************************************/
		shortVar = 0b01000000_11000000;
		
		doubleVar = shortVar;
		floatVar = shortVar;
		longVar = shortVar;
		intVar = shortVar;
		byteVar = (byte) shortVar;
		charVar = (char) shortVar;
		
		System.out.println("- = short = -");
		System.out.println(String.format("%- 30d\t%64s", shortVar, Integer.toBinaryString(Short.toUnsignedInt(shortVar))));
		
		System.out.println(String.format("%- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println(String.format("%- 30.20e\t%64s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		System.out.println(String.format("%- 30d\t%64s", longVar, Long.toBinaryString(longVar)));
		System.out.println(String.format("%- 30d\t%64s", intVar, Integer.toBinaryString(intVar)));
		System.out.println(String.format("%- 30d\t%64s", byteVar, Integer.toBinaryString(Byte.toUnsignedInt(byteVar))));
		System.out.println(String.format("%c%25s\t%64s", charVar, "", Integer.toBinaryString(Short.toUnsignedInt((short)charVar))));
		System.out.println("- = #### = -");	
		
		/**************************************************/
		byteVar = (byte) 0b11000000;
		
		doubleVar = byteVar;
		floatVar = byteVar;
		longVar = byteVar;
		intVar = byteVar;
		shortVar = byteVar;
		charVar = (char) byteVar;
		
		System.out.println("- = byte = -");
		System.out.println(String.format("%- 30d\t%64s", byteVar, Integer.toBinaryString(Byte.toUnsignedInt(byteVar))));
		
		System.out.println(String.format("%- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println(String.format("%- 30.20e\t%64s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		System.out.println(String.format("%- 30d\t%64s", longVar, Long.toBinaryString(longVar)));
		System.out.println(String.format("%- 30d\t%64s", intVar, Integer.toBinaryString(intVar)));
		System.out.println(String.format("%- 30d\t%64s", shortVar, Integer.toBinaryString(Short.toUnsignedInt(shortVar))));
		System.out.println(String.format("%c%25s\t%64s", charVar, "", Integer.toBinaryString(Short.toUnsignedInt((short)charVar))));
		System.out.println("- = #### = -");	
		
		/**************************************************/
		charVar = 0b01000000_11000000;
		
		doubleVar = charVar;
		floatVar = charVar;
		longVar = charVar;
		intVar = charVar;
		shortVar = (short) charVar;
		byteVar = (byte) charVar;
		
		System.out.println("- = char = -");
		System.out.println(String.format("%c%25s\t%64s", charVar, "", Integer.toBinaryString(Short.toUnsignedInt((short)charVar))));
		
		System.out.println(String.format("%- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println(String.format("%- 30.20e\t%64s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		System.out.println(String.format("%- 30d\t%64s", longVar, Long.toBinaryString(longVar)));
		System.out.println(String.format("%- 30d\t%64s", intVar, Integer.toBinaryString(intVar)));
		System.out.println(String.format("%- 30d\t%64s", shortVar, Integer.toBinaryString(Short.toUnsignedInt(shortVar))));
		System.out.println(String.format("%- 30d\t%64s", byteVar, Integer.toBinaryString(Byte.toUnsignedInt(byteVar))));
		System.out.println("- = #### = -");
		
		/**************************************************/
		
		System.out.println("- = float to double = -");
		floatVar = 0.27f;
		System.out.println(String.format("F: %- 30.20e\t%35s", floatVar, Integer.toBinaryString(Float.floatToIntBits(floatVar))));
		doubleVar = floatVar;
		System.out.println(String.format("D: %- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		doubleVar = 0.27d;
		System.out.println(String.format("D: %- 30.20e\t%64s", doubleVar, Long.toBinaryString(Double.doubleToRawLongBits(doubleVar))));
		System.out.println("- = #### = -");	
	}

}
