package com.openlap.user.entities.utility_entities;

import com.openlap.analytics_statements.entities.utility_entities.UniqueIdentifierType;
import lombok.*;
import org.bson.types.ObjectId;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LrsProvider {
  private ObjectId id = new ObjectId();
  private String lrsId;
  private String clientId;
  private UniqueIdentifierType uniqueIdentifierType;
}
