## Inspiration
Indonesia is incredibly diverse, with its many cultures and regional languages. Unfortunately, many of these local languages are being forgotten. This could be due to a lack of interest, the perception that they're not useful or appealing, or simply the lack of accessible resources. On the other hand, many elders or people living in remote areas still do not speak Indonesian fluently. This inspired us to create Makna — a platform that aims to unite people through the richness of our linguistic diversity. Language is not just a tool for communication; it's a powerful way to understand others more deeply and build meaningful relationships. With Makna, people can preserve their cultural and linguistic heritage while experiencing connection and closeness — regardless of background, location, or time.

## What it does
Makna is a web application where you can share experiences with others and learn about local Indonesian languages. It offers three main features:
1. Crowd Dictionary / Glossary: A community-driven dictionary where users can share and search for words, complete with voice recordings for pronunciation, meanings, and usage examples. The search system is powered by AI using Retrieval-Augmented Generation (RAG), which allows users to find relevant words and meanings even when using different dialects, spelling variations, or informal usage. This makes discovering and understanding local terms more intuitive and intelligent.
2. Makna Call: A feature that allows users to connect with people from different cultures, anytime and anywhere. Makna Call includes real-time AI-powered transcription and translation, enabling seamless conversations across different languages and dialects. This breaks down language barriers and helps users communicate naturally and meaningfully.
3. Leaderboard: A gamified leaderboard with daily quests to encourage continuous engagement and knowledge sharing within the community. It motivates users to actively contribute and learn together.

## How we built it
#### Frontend
- React + Vite + Typescript
- Shadcn & TailwindCSS
- Many other miscelanous library, e.g. framer-motion
#### Backend
- Express.js
- Peerjs
- Socket.IO for real-time communication
- PostgreSQL

#### AI & Machine Learning
- Crowd Dictionary (RAG)
	- AI Powered search using RAG pipeline through Langchain Framework under milvus vector database
- Speech Translation
	- Using Whisper, user speech are transcribed and translated to their desired language


## Challenges we ran into
1. Handling Diverse Local Dialects and Limited Datasets
Many Indonesian local languages lack digital resources, making it difficult to provide accurate speech recognition and translation support. We had to find creative ways to train and test with limited datasets or community-generated examples.
2. Ensuring Smooth Real-Time Translation During Video Calls
Balancing performance and accuracy in real-time transcription and translation—especially during live conversations—was a major technical hurdle. Latency and incorrect translations could interrupt the natural flow of communication.
3. Maintaining Video Call Stability
Ensuring a stable and low-latency video call experience using PeerJS was challenging, especially when users had different network speeds or unstable internet connections. We had to optimize the peer-to-peer communication flow and handle disconnections gracefully.
4. Managing Time Effectively as a Team
With multiple features to build in a limited timeframe, time management and task prioritization became a critical challenge. Balancing frontend, backend, and integration work required clear coordination and agile development practices.

## Accomplishments that we're proud of
1. Global Expansion as a Third-Party Tool
We envision Makna becoming a third-party embeddable platform, where communities from any part of the world can create their own versions of crowd-sourced dictionaries and cultural exchanges. This means: Makna will support non-Indonesian languages, enabling other countries to preserve and share their local dialects and cultural stories. Organizations or educators globally can use Makna for language learning, cultural preservation, or heritage education.
2. Collaboration with Common Voice by Mozilla
We aim to partner with Common Voice, Mozilla’s open-source voice dataset initiative, to contribute authentic voice recordings from various Indonesian local languages. This collaboration will: Support speech technology development for underrepresented languages. Enhance Makna’s speech recognition accuracy. Encourage communities to take part in digital language preservation.

## What we learned
##### Creativity is Endless
After watching the keynotes adn chattering with other participant, we found that the creativity to solve the problem are really endless. Through technology, many kinds of different problems can be solved, and we found that some people face problems and struggles with their unique hardships.
##### Working agile as a team
With a small team, we learned the true value of agile development, maintaining our backlogs in checks, and also still maintain the best quality that we want to represent. Each feature allowed us to move forward step by step even with limited time.

## What's next for Makna?

##### Tackling a Meaningful Indonesian Challenge
We are proud that our project has a heart and are actually creative. We didn’t choose an abstract problem, but a real-world problem that people might overlook. We are proud to be building something that could help facilitate the new generation to learn their culture.

##### Building a Dictionary that is Community Based
We didn’t want just another word list. We created a dictionary that thinks and adapt with the culture and community based around it. Makna is not just your usual dictionary that you can buy at the store, it is a piece of culture that someone place there to be remembered and created (p.s. you can add slangs and also add cultural nuances that make our platform different than the others!)