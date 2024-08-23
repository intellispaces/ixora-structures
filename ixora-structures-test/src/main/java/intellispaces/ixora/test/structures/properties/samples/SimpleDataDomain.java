package intellispaces.ixora.test.structures.properties.samples;

import intellispaces.core.annotation.Data;
import intellispaces.core.annotation.Domain;
import intellispaces.core.annotation.Transition;

@Data
@Domain("0bb8a186-8692-45b2-8018-5d56beda0239")
public interface SimpleDataDomain {

  @Transition("6d8468c0-2cf2-4a95-9535-c731a40d17e9")
  Integer intValue();

  @Transition("8f1359e9-0adc-4881-8480-933110ae3912")
  Double doubleValue();

  @Transition("d083ddee-a5af-46fe-8f56-c63e20eca986")
  String stringValue();
}
