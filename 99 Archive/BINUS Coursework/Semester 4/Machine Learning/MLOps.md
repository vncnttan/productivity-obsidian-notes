Machine Learning Operations
`Praktik yang digunakan untuk menstandarkan dan automatisasi end-to-end Machine Learning Lifecycle`

Mempromosikan kolaborasi antara data scientist dengan devops teams

Challenges:
- Data (noisy data, ensuring quality, & concistency)
- Model (overfitting & underfitting, interpretability)
- Deployment (versioning, integration with system)
- Monitoring (degradation, feedback loops)

Tools:
- Tensorflow extended
- MLflow
- Kubeflow

Version Control:
- Git
- Model Registry (specifically designed to control model versions, metadata, and deployment)

Containers:
- Package software apps and their dependencies to a single isolated unit
- Enkapsulasi semua dalam menjalankan software
- Memberikan konsistensi karena model dan dependensinya di pack secara bersamaan

CI/CD
- Automated Testing
- Versioning
- Continuous Integration
- Continuous Deployment

Model Monitoring:
- Ensure continued effectiveness and reliability
- Involves tracking metrics, data drift, and performance

Data Drift: Perubahan distribusi input data mungkin mempengaruhi performa model
Model Drift: Degradasi performa model karena beberapa faktor seiring berjalannya waktu

Model Governance: 
Peraturan dan proses untuk mengatur ML models

Lifecycle Management: Protokol setiap stage dari deployment to retirement
Risk Management: Mitigate risk associated to deployment

Ethical Considerations:
- Bias & Fairness
- Transparency

Compliance & Regulations
- Regulatory Environment
- Legal and Ethical Compliance

Documentation & Auditing
- Comprehensive Documentation
- Versioning
- Auditing Process

Implementation Strategies
- Model Governance Framework (MDLC, CRISP-DM)
- Automatization (Tools and platforms to do enforce policies concistently)
- Cross Functional Collaboration (Collaboration between data scientist and legal experts)