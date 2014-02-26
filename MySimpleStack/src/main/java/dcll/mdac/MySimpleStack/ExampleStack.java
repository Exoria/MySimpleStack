package dcll.mdac.MySimpleStack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class ExampleStack implements SimpleStack{
	private ArrayList<Item> items;
	
	public ExampleStack() {
		// TODO Auto-generated constructor stub
		this.items = new ArrayList<Item>();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return items.isEmpty();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public void push(Item item) {
		// TODO Auto-generated method stub
		items.add(item);
	}

	@Override
	public Item peek() throws EmptyStackException {
		// TODO Auto-generated method stub
		return items.get(0);
	}

	@Override
	public Item pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		Item top = items.get(0);
		items.remove(0);
		return top;
	}

}
