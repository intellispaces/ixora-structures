package intellispaces.ixora.test.structures.properties.samples;

import intellispaces.framework.core.annotation.Channel;
import intellispaces.framework.core.annotation.Data;
import intellispaces.framework.core.annotation.Domain;

@Data
@Domain("610bdc9a-6054-4777-b1de-4a7e6441317d")
public interface PrimitiveDataDomain {

  @Channel("756b6fa0-5d0c-4143-bf40-fcf171ae9fe9")
  Integer intValue();

  @Channel("3b17bdd4-525c-4616-890f-444045e65346")
  Double doubleValue();
}
