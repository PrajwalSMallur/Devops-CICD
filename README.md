# Devops-CICD
# DevOps CI/CD Project 

## Project Overview
This project demonstrates an end-to-end CI/CD pipeline built from scratch using GitHub Actions.
Whenever code is pushed to the repository, it is automatically built, tested for code quality,
and deployed.

## Tools Used
- GitHub (Source Code Management)
- GitHub Actions (CI/CD Automation)
- Java
- Maven
- SonarCloud (Static Application Security Testing)

## Branching Strategy
- develop: Used for development and CI
- main: Used for production deployment

## CI Pipeline (Continuous Integration)
The CI pipeline runs automatically when code is pushed to the develop branch.

Steps:
1. Checkout source code
2. Setup Java environment
3. Build the application using Maven
4. Run SonarCloud quality checks
5. Quality Gate decides Go/No-Go

## CD Pipeline (Continuous Deployment)
The CD pipeline runs automatically when code is merged into the main branch.

Steps:
1. Deploy the generated artifact
2. Perform health checks
3. Confirm successful deployment

## Artifact Handling
Once the artifact is built, the same artifact is deployed directly.
Artifact repositories like Nexus are used only to store older versions
for rollback or redeployment when required.

## Conclusion
This project follows real-world DevOps practices including CI, CD,
quality gates, and automation.
