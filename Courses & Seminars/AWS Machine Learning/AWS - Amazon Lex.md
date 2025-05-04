`Billed as the inner workings of Alexa` → Natural-language chatbot engine

Bot built around **intents**
- Lambda functions are invoked to fulfill the intent
- Slots specify extra information needed by the intent

- Can deploy to AWS Mobile SDK, Facebook Messenger, Slack, Twilio

`Lex Automated Chatbot Designer`
- Provide existing conversation transcripts
- Applies NLP & Deep Learning
	- Removing overlaps & ambiguity
- Extract intents, user requests, phrases, values for slots are extracted
- Ensures intents are well defined and separated
- Integrates with Amazon Connect transcripts


Utterances: Intents (“I want to order pizza”)
Lambda functions: Function that are invoked to fulfill the intent
Slots: Extra information needed by the intent (“topping”)
Slot Value: The information provided (“pepperoni”)