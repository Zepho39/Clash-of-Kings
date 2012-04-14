public interface ILo<T>{
	
	ILo<City> getCities();
}

class Cons<T> implements ILo<T>{
	T first;
	ILo<T> rest;
	
	Cons(T first, ILo<T> rest){
		this.first = first;
		this.rest = rest;
	}
	
	ILo<City> getCities(){
		
	}
}

class Empty<T> implements ILo<T>{
	
}