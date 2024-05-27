Atomicity
- All of the commands that make up a transaction are treated as a single unit and either success or fail together. In the automatic transaction, it was either all of it or none at all. If there was something happening in the middle of the process, all the changes are undid back to their original state.

Consistency
- Rules and keys are consistent and are implemented throughout the database. This also includes the data type, cascades, constraints, triggers, etc.
  
Isolation
- Transaction in the database should be isolated when multiple transaction occurs at the same time and prevents transactions from interfering with each other and ensures that they don't see each other uncommitted changes

Durability
- Once the transaction is committed it will remain so even in the case of system failure. Effect of transactions are recorded permanently in the database.
