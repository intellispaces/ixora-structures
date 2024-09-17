package intellispaces.ixora.structures.collection;

import intellispaces.common.javastatement.type.Type;
import intellispaces.common.javastatement.type.Types;
import intellispaces.framework.core.annotation.Mapper;
import intellispaces.framework.core.annotation.ObjectHandle;

import java.util.Collections;

@ObjectHandle(value = ListDomain.class, name = "JavaList")
public abstract class AbstractJavaList<E> implements UnmovableList<E> {
  private final java.util.List<E> list;
  private final Type<E> elementDomain;

  public AbstractJavaList(java.util.List<E> list, Class<E> elementDomain) {
    this.list = Collections.unmodifiableList(list);
    this.elementDomain = Types.of(elementDomain);
  }

  public AbstractJavaList(java.util.List<E> list, Type<E> elementDomain) {
    this.list = Collections.unmodifiableList(list);
    this.elementDomain = elementDomain;
  }

  @Mapper
  @Override
  public Collection<E> asCollection() {
    return new JavaCollection<>(list, elementDomain);
  }

  @Override
  public Type<ListDomain<E>> domain() {
    return Types.of(ListDomain.class, elementDomain);
  }

  @Mapper
  @Override
  public Type<E> elementDomain() {
    return elementDomain;
  }

  @Mapper
  @Override
  public E element(int index) {
    return list.get(index);
  }

  @Mapper
  @Override
  public int size() {
    return list.size();
  }

  @Override
  public java.util.List<E> nativeList() {
    return list;
  }

  @Override
  public java.util.Collection<E> nativeCollection() {
    return list;
  }
}
