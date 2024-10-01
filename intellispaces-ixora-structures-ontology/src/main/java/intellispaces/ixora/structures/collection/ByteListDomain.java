package intellispaces.ixora.structures.collection;

import intellispaces.common.base.type.Type;
import intellispaces.framework.core.annotation.Domain;
import intellispaces.framework.core.annotation.Transition;

/**
 * Alias for the domains NumberListDomain&lt;Byte&gt;.
 */
@Domain("46127f8a-6396-4bb8-8af4-d85ebd37f143")
public interface ByteListDomain extends NumberListDomain<Byte> {

  /**
   * Downgrade mapping.
   */
  @Override
  @Transition("306a5434-65fc-4c81-8ec5-2804ffff99b6")
  CollectionDomain<Byte> asCollection();

  @Override
  @Transition("f5bf6431-109a-4906-a54d-d30755a623c9")
  Byte get(int index);

  @Override
  @Transition("e151b008-acd1-4dda-9ddb-e7c78b5e34ef")
  Type<Byte> elementDomain();
}
