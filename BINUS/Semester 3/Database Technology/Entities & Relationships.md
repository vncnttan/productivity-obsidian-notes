**Entity: Real world object distinguishable from other objects.** 
Entity is described using set of attributes
Entity set: Collection of similar entities.

**Relationship: Association among two or more entities**
Relationship Set: Collection of similar relationship.

Relation types: 
1. one-to-one
2. one-to-many
3. many-to-one
4. many-to-many

**Participation constraints**: A role that is assigned to manager, that relates totally/partially to a thing.
- **Total Participation**: This is also called existence dependency. In this case, every instance of an entity must participate in the relationship. This is often represented by a double line connecting the entity set to the relationship set in an ER diagram.
- **Partial Participation**: In this case, an entity's participation in the relationship is optional. Some instances of the entity may not participate in the relationship at all. This is often represented by a single line connecting the entity set to the relationship set in an ER diagram.

**Weak entity**: A weak entity is a type of entity that does not have a primary key attribute of its own that uniquely identifies its instances. Instead, it relies on a "discriminating" attribute, along with a relationship to another (strong or owning) entity, for its identity. 
Example: 
- **Book** (strong entity) with attributes like ISBN, Title, Author, etc.
- **Copy** (weak entity) with attributes like CopyNumber, Condition, etc.

**ISA (is-a) Hierarchies**
Giving constraints to overlapping between entities that is inherited into something.
For example:
**an Employee**, can be a **freelance Employee, part-time Employee,** and **full-time employee** where each employee cannot be both at the same time.

**Design Choices:**
Should a concept be modelled as an entity or an attribute

Learn more about how to read the diagram and differentiating bad and good choices.



- Entity
- Relationship
- Attribute

