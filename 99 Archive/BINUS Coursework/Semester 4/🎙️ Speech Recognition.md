12 Session - 2 SKS
#COMPSCIBINUS🏫2ndSEM 
### Session 1 - Intro to Speech **Recog**
Points:
- There are still many challenges in speech recognition (unspoken knowledge, noises, language, dialects, etc)

[[Dialogue Paradigm - Speech Recognition]]

Continuous Speech (recording of speech and its transcript, not dictated).

![[Pasted image 20240215122611.png]]

[[WER - Word Error Rate - Speech Recognition]]


Speech to Speech Translation
Speech Recog -> Machine Translation -> Speech Syntethizer

#### \[UTS] Definitions
- Amplitudo
  A measure of strength or intensity of a signal, the more high it is, the more loud the sound is.
  
- Frekuensi
  The number of waves that pass a fixed point in unit time, the more frequency it is, the more pitchy it will be
  
- Sample Rate
  The number of samples per second (or per other unit) taken from a continuous signal to make a digital signal

- Waveform
  A graph representing how the sound changes of Amplitude varies with time

- Spectrogram 
  A visual representation of the spectrum of frequencies of a signal as it varies with time
  
  Horizontal : Time
  Vertical: Frequency
  Intensity: Intensity of Blackness
  
  Provide a visual display of speech that corresponds to the analysis performed by the ear

- Spectrum
  Acoustic components that identify the complex soundwave

- Phone
  The smallest unit of distinct speech sound (useful for thorough analysis of language, and different languages)
  
- Phoneme
  The smallest unit of sounds (similar to Phone) that people can use to build new words, even if they have different phone, a language may adopt one phoneme to it.


Narrow Phonetic Translation uses *Phone*, meanwhile the Broad uses *Phoneme*.

#### \[UTS] ASR Architecture
Automatic Speech Recognition 

![[Pasted image 20240331200456.png]]

Feature (Input): Audio 
Target (Output): Transcript
1. Cepstral Feature Extraction with MFCC to extract 39 MFCC features
2. Fed the MFCC Features to the Gaussian Acoustic Model to compute P(o | w)
3. Gaussian Acoustic Model will produce the Phone Likelihoods
   HMM Lexicon is a model dictates which phones can follow each other
   N-Gram Language Model  dictates grammatical rule and order
4. Fed all three to the Viterbi Algorithm (Decoder) to get the word sequence from the speech

![[Pasted image 20240402122003.png]]
Where the P(O | W) is the Phone Likelihood and HMM Lexicon, meanwhile the P(W) is the N-gram Language Model

#### \[UTS] MFCC
- Windowing: Given a sample of audio an input, the first step of MFCC is to window to temporal dimension. This is done because applying the whole audio to the Fourier Transformation is not very informative.
  ![[Pasted image 20240402122509.png]]
- Cepstrum -> A spectral transformation that is used before MFCC


Step:
1. Windowing
2. Compute Spectrogram using the Fourier Transformation
3. On each window, apply the Triangular Filter bank
4. Apply Discrete Cosine Transform to obtain the MFCC Coefficient

Pros:
- Quantify the gross shape of the spectrum (important in identification of vowel)
- Removes the fine spectral structure which is often less important
- Straightforward and computationally efficient
- The performance is well tested and understood

Cons: 
- The choice of perceptual scale is not well motivated
- The performance in presence of additive noise, has not always been good

FFT (Fast Fourier Transform)
Converts a signal into individual spectral components and thereby provides frequency information about the signal

Mel Frequency Filter Bank
Outputs a frequency domain auditory filter bank using the me frequency scale. It is used to decompose an audio signal into separate frequency bands in the mel frequency scale, which mimics the nonlinear human perception of sound.

#### \[UTS] HMM - GMM
Position in ASR: HMM Lexicon.
Counting the probability of another sound is followed by another sound

Hidden Markov Model
The GMM is a Hidden State in the HMM. Markov chain contains all the possible states of a system an the probability of transitioning from one state to another

Gaussian Mixture Model
Probability distribution which determines that once in a particular state, this other particular speech vector can be generated. Distribution of features for a phone.

#### \[UTS] wav2vec & wav2vec 2.0
wav2vec 2.0 is the improved version wav2vec 1.0 
Both uses unlabeled data

wav2vec1.0 uses masked language modeling, trying to predict missing part of the audio
wav2vec2.0 employs contrastive learning to differentiate between similar and dissimilar audio segments

wav2vec

#### \[UTS] CASE 40%
- Hitung emission & transition probability
- Simulasi prediksi menggunakan viterbi algorithm dari EP & TP yang telah dihitung


### Session 2
### Session 3
### Session 4
### Session 5

[[wav2vec - GSLC - Speech Recognition ]]

### Session 6
### Session 7
### Session 8

[[Wizard Of Oz - Speech Recognition]]

### Session 9
### Session 10
### Session 11
### Session 12
### Session 13
### Session 14
### Session 15
### Session 16
### Session 17
### Session 18
### Session 19
### Session 20
### Session 21
### Session 22
### Session 23
### Session 24
