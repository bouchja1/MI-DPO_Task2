package cz.cvut.fit.dpo.strategy.tree;

/**
 * @author bouc2162
 *
 * @param <T>
 */
public class NonNullNode<T extends Comparable<T>> implements Comparable<Object>, Node<T> {
	private T value;
	private Node<T> left;
	private Node<T> right;

	public NonNullNode(T value) {
		this(value, null, null);
	}

	public NonNullNode(T value, Node<T> left, Node<T> right) {
		this.setValue(value);
		this.left = left;
		this.right = right;
	}

	@Override
	public T getValue() {
		return value;
	}

	@Override
	public void setValue(T value) {
		if (value == null)
			throw new IllegalArgumentException("node value cannot be null");
		this.value = value;
	}

	@Override
	public Node<T> getLeft() {
		return left;
	}

	@Override
	public void setLeft(Node<T> left) {
		this.left = left;
	}

	@Override
	public Node<T> getRight() {
		return right;
	}

	@Override
	public void setRight(Node<T> right) {
		this.right = right;
	}

	@Override
	public boolean isLeaf() {
		return ((this.left == null) && (this.right == null));
	}

	@Override
	public int compareTo(Object o) {
		Node<T> other = (Node<T>) o;
		return this.getValue().compareTo(other.getValue());
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Node node = (Node) o;

		if (!value.equals(node.getValue())) {
			return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value.toString();
	}

}
