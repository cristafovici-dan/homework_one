package Student;

import java.util.*;

public class StudentList implements List<Student> {
  private static final int DEFAULT_CAPACITY = 10;
  private Object[] elements;
  private int size;


  public StudentList() {
    this.elements = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }
  public StudentList(int size) {
    this.elements = new Object[size];
    this.size = 0;
  }

  @Override()
  public int size() {
    return this.size;
  }

  @Override
  public boolean isEmpty() {
    return this.size == 0;
  }

  @Override
  public boolean contains(Object o) {
    if(this.elements.length == 0 ) {
      return false;
    }
    for(int i = 0; i < this.size; i++) {
      if(this.elements[i].equals(o)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Iterator<Student> iterator() {
    //TODO
    return null;
  }

  @Override
  public Object[] toArray() {
    // TODO
    return null;
  }

  @Override
  public <T> T[] toArray(T[] ts) {
    //TODO
    return null;
  }

  @Override
  public boolean add(Student student) {
    if(this.size == this.elements.length) {
      int newCapacity = this.elements.length * 2;
      this.elements = Arrays.copyOf(elements, newCapacity);
    }
    this.elements[this.size++] = student;

    return true;
  }

  @Override
  public boolean remove(Object o) {

    return false;
  }

  @Override
  public void clear() {
    this.size = 0;
    this.elements = new Object[DEFAULT_CAPACITY];
  }

  @Override
  public Student get(int i) {
    if(i >= 0 && i < this.size) {
      return (Student) this.elements[i];
    }
    return null;
  }

  @Override
  public Student set(int i, Student student) {
    if(i >= 0 && i < this.size) {
      this.elements[i] = student;
      return student;
    }
    return null;
  }

  @Override
  public void add(int i, Student student) {
    //TODO
  }

  @Override
  public Student remove(int i) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    if(o instanceof Student) {
      for(int i = 0; i < this.size; i++){
        if(this.elements[i].equals(o)) {
          return i;
        }
      }
    }
    return -1;
  }

  @Override
  public int lastIndexOf(Object o) {
    int lastIndexOf = -1;
    if(o instanceof Student) {
      for (int i = 0; i < this.size; i++) {
        if (this.elements[i].equals(o)) {
          lastIndexOf = i;
        }
      }
    }
    return lastIndexOf;
  }

  @Override
  public ListIterator<Student> listIterator() {
    //TODO
    return null;
  }

  @Override
  public ListIterator<Student> listIterator(int i) {
    //TODO
    return null;
  }

  @Override
  public List<Student> subList(int i, int i1) {
    //    TODO if i less than 0
    if(i > i1) {
      throw new Error("indexFrom(" + i + ") cannot be more than indexTo(" + i1 + ")");
    }
    if(i1 > this.size) {
      throw new Error("indexTo(" + i + ") cannot be more than size(" + this.size + ")");
    }

    if(i == i1) {
      return new StudentList(0);
    }

    StudentList subList = new StudentList(i1 - i);
    for(int j = i; j < i1; j++ ) {
      subList.add((Student) this.elements[j]);
    }

    return subList;
  }

  @Override
  public boolean addAll(Collection<? extends Student> collection) {
    int initialSize = this.size;
    for(Student student : collection) {
      this.add(student);
    }

    return this.size > initialSize;
  }

  @Override
  public boolean containsAll(Collection<?> collection) {
    //Ignore this for homework
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean addAll(int i, Collection<? extends Student> collection) {
    //Ignore this for homework
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean removeAll(Collection<?> collection) {
    //Ignore this for homework
    throw new UnsupportedOperationException();
  }

  @Override
  public boolean retainAll(Collection<?> collection) {
    //Ignore this for homework
    throw new UnsupportedOperationException();
  }

  @Override()
  public String toString() {
    if (this.size == 0) {
      return "[]";
    }
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < this.size - 1; i++) {
      sb.append(this.elements[i]).append(", ");
    }
    sb.append(this.elements[this.size - 1]).append("]");
    return sb.toString();
  }
}
