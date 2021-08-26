package JavaBasics;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcept {

	//keyword: enum
	enum Lang{
		JAVA,
		CSharp,
		JAVASCRIPT,
		PYTHON,
		RUBY
	}
	public static void main(String[] args) {
		

		EnumSet<Lang> langs= EnumSet.allOf(Lang.class);
		System.out.println(langs);//output: [JAVA, CSharp, JAVASCRIPT, PYTHON, RUBY]

//empty enum
		EnumSet<Lang> none= EnumSet.noneOf(Lang.class);
		System.out.println(none); //output: []

//range(e1,e2)
		EnumSet<Lang> enumRange= EnumSet.range(Lang.JAVA, Lang.JAVASCRIPT);
		System.out.println(enumRange); //output: [JAVA, CSharp, JAVASCRIPT]

//of method
		EnumSet<Lang> CSharpEnum= EnumSet.of(Lang.CSharp);
		System.out.println(CSharpEnum); //output: [CSharp]
		
//multipleEnum method
		EnumSet<Lang> multipleEnum= EnumSet.of(Lang.JAVA,Lang.RUBY);
		System.out.println(multipleEnum); //output: [JAVA, RUBY]

//add and addAll() method
		EnumSet<Lang> lang1= EnumSet.allOf(Lang.class);
		EnumSet<Lang> lang2= EnumSet.noneOf(Lang.class);
		
		lang2.add(Lang.JAVASCRIPT);
		
		lang2.addAll(lang1);
		
		System.out.println(lang2); //output: [JAVA, CSharp, JAVASCRIPT, PYTHON, RUBY]

//Iterate EnumSet
		//Iterator
		EnumSet<Lang> fullLang= EnumSet.allOf(Lang.class);
		
		Iterator<Lang> it = fullLang.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

//remove() and removeAll()	
		EnumSet<Lang> newLang= EnumSet.allOf(Lang.class);
		
		boolean isRemoved = newLang.remove(Lang.CSharp);
		System.out.println(isRemoved); //true
		System.out.println(newLang); //[JAVA, JAVASCRIPT, PYTHON, RUBY]
		
		boolean isRemovedAll = newLang.removeAll(newLang);
		System.out.println(isRemovedAll); //true
		System.out.println(newLang); //[]
		
	}
	

}
