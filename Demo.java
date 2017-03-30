import java.util.*;
public class Demo{
	private List<String> u;
	public static void main(String[] args){
		Demo d = new Demo();
		List<String> uu = new ArrayList<String>();
		d.pn2();
		uu.add("xx");
		uu.add("yy");
		uu.add("zz");
		d.addAll(uu);
		d.add(1,"qq");
		d.pn3();
	}

	public void pn(String o){
		System.out.println(o);
	}

	public Demo(){
		u = new ArrayList<>();
	}

	public void add() {
		pn("add");
		u.add("1");
	}

	public void add(int index, String ele){
		pn("add");
		u.add(index, ele);
	}

	public boolean addAll(List<String> o){
		pn("addAll");
		return u.addAll(o);
	}

	public boolean addAll(int index, List<String> o){
		pn("addall");
		return u.addAll(index, o);
	}

	public void clear() {
		pn("clear");
		u.clear();
	}

	public boolean contains(String o) {
		pn("contains..");
		boolean flag = u.contains(0);
		return flag;
	}

	public boolean contains(List<String> c){
		pn("contains..");
		boolean flag = u.contains(c);
		return flag;
	}

	public boolean equals(List<String> o){
		pn("equals");
		return u.equals(o);
	}

	public String get(int pos){
		pn("get");
		return u.get(pos);
	}

	/*
	int hashCode(){
		 return u.hashCode();
	}
	*/

	public int indexOf(String o){
		pn("indexOf");
		return u.indexOf(o);
	}

	public boolean isEmpty(){
		pn("isEmpty");
		return u.isEmpty();
	}

	public void it(){
		Iterator<String> it = iterator();
		while(it.hasNext()){
			String str = it.next();
			pn(str);
		}
	}

	public void it2(){
		ListIterator<String> it = listInterator();
		while(it.hasNext()){
			String str = it.next();
			pn(str);
		}
	}

	public void it3(int index){
		ListIterator<String> it = listInterator(index);
		while(it.hasNext()){
			String str = it.next();
			pn(str);
		}
	}

	Iterator<String> iterator(){
		pn("iterator");
		return u.iterator();
	}

	public int lastIndexOf(String o){
		pn("lastIndexOf");
		return u.lastIndexOf(o);
	}

	ListIterator <String> listInterator(){
		pn("listiterator");
		return u.listIterator();
	}

	ListIterator <String> listInterator(int index){
		pn("listiterator");
		return u.listIterator(index);
	}

	public String remove(int index){
		pn("remove");
		return u.remove(index);
	}

	public boolean remove(Object o){
		pn("remove");
		return u.remove(o);
	}

	public boolean removeAll(List<String> o){
		pn("removeAll");
		return u.removeAll(o);
	}

	public boolean retainAll(List<String> o){
		pn("removeAll");
		return u.retainAll(o);
	}

	public String set(int index, String elem){
		pn("set");
		return u.set(index, elem);
	}

	public int size(){
		pn("size");
		return u.size();
	}

	public List<String> subList(int begin, int end){
		pn("subList");
		return u.subList(begin, end);
	}

	public Object[] toArray(){
		pn("toArray");
		return u.toArray();
	}

	public String[] toArray(String[] a){
		pn("toArray");
		return u.toArray(a);
	}

	public void pn2(){
		pn(">");
		pn("start");
	}

	public void pn3(){
		pn("end");
		pn(">");
	}
}
