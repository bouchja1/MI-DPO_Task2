package cz.cvut.fit.dpo.strategy.tree;

/**
 * @author bouc2162
 *
 * @param <T>
 */
public class NullNode<T extends Comparable<T>> implements Comparable, Node<T> {

	@Override
	public T getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NonNullNode<T> getLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLeft(Node<T> left) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NonNullNode<T> getRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRight(Node<T> right) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		NonNullNode node = (NonNullNode) o;

		if (!getValue().equals(node.getValue())) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		return getValue().hashCode();
	}

	@Override
	public String toString() {
		return getValue().toString();
	}	
}
