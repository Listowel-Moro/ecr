# Pushing Java App Image to Amazon Elastic Container Registry (ECR)

## Objective

In this lab, I containerized a Java application and deployed the container image to Amazon Elastic Container Registry (ECR) using a GitHub Actions pipeline.

## Tasks

1. **Prepare the Application**
   - I wrote a `Dockerfile` and included other necessary files to build a Docker image of my Java application.

2. **Configure GitHub Actions Workflow**
   - I set up a GitHub Actions workflow that is triggered on every push to the `main` branch.
   - The workflow automates the following:
     - Builds the Docker image of my application.
     - Tags the Docker image with my fullname and app name.
     - Pushes the Docker image to my public ECR repository.
