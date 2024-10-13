## User 

User-Based
- **IAM Policies** – which API calls should be allowed for a specific user from IAM

Resource-Based
- Bucket Policies – bucket wide rules from the S3 console - allows cross account 
- Object Access Control List (ACL) – finer grain (can be disabled) 
- Bucket Access Control List (ACL) – less common (can be disabled)

```
Note: an IAM principal can access an S3 object if • The user IAM permissions ALLOW it OR the resource policy ALLOWS it • AND there’s no explicit DENY
```


Encryption: encrypt objects in Amazon S3 using encryption keys

S3 Bucket Policies
![[Pasted image 20241012144831.png]]

## Amazon S3 - Object Encryption

#### Server-Side Encryption (SSE)
- Server-Side Encryption with Amazon S3-Managed Keys (SSE-S3) 
	Enabled by Default 
	Set header: `"x-amz-server-side-encryption": "AES256"`

- Server-Side Encryption with KMS Keys stored in AWS KMS (SSE-KMS)
	AWS Key Management Service
	Set header: `"x-amz-server-side-encryption": "aws:kms"`
	**Advantages**: More user control & audit (log) key usage using CloudTrail
	**Disadvantage:** Every time you upload and delete file, an API to KMS Service will be called, which count towards the KMS quota per second.
	
	![[Pasted image 20241013142159.png]]

- Server-Side Encryption with Customer-Provided Keys (SSE-C)
  Key must be provided in HTTP headers every time the request is made.
  Must use HTTPS for SSE-C
  ![[Pasted image 20241013142505.png]]
  

#### Client Side Encryption
Easier to implement, can use client libraries such as **Amazon S3 Client-Side Encryption Library**

- The client must encrypt and decrypt the data themselves before sending and retrieving to/from Amazon S3
- Customer fully manages the keys and encryption cycle
![[Pasted image 20241013142700.png]]




## Amazon S3 – Encryption in transit (SSL/TLS)
- HTTP Endpoint - Non encrypted
- HTTPS Endpoint - encryption in flight

- HTTPS is recommended (mandatory in SSE-C)
- Most client would use the HTTPS endpoint by default


#### Force Encryption in Transit aws:SecureTransport
![[Pasted image 20241013143109.png]]
This means deny when the request sent is using HTTP (where the SecureTransport is false), not HTTPS


## Default Encryption vs. Bucket Policies
![[Pasted image 20241013191003.png]]

## VPC Endpoint Gateway for S3
![[Pasted image 20241013195454.png]]

This means if you have any service in VPC (AWS) -> They can directly communicate with your bucket and transfer data without internet access, they will use the VPC endpoint gateway
- Less expensive
- More Private & Secure








