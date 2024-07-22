package SE05Operadores;

public class OperadorUnario {

	public static void main(String[] args) {
		
		//
		var a =3;
		var b = -a;
		
		System.out.println(b);
		
		//
		var c = true;
		var d = !c;
		
		System.out.println(d);
		
		//
		
		var e = 3;
		var f = ++e;
		
		System.out.println(f);
		
		//
		
		var g= 5;
		var h = g++;
		System.out.println(g + " - " + h);
		h =5 ;
		System.out.println(h);
		
		//decremento
		
		var i = 2;
		var j = --i;  //ejecuta al momento
		var k = i++;  //ejecuta despues
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		
		
	}
}
