## Micronaut 2.5.11 Documentation

- [User Guide](https://docs.micronaut.io/2.5.11/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.5.11/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.5.11/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

# Micronaut and Azure Function

## Prerequisites

- Gradle 5+
- Latest [Function Core Tools](https://aka.ms/azfunc-install)
- Azure CLI. This plugin use Azure CLI for authentication, please make sure you have Azure CLI installed and logged in.

## Setup

```cmd
az login
az account set -s <your subscription id>

## Running the function locally

```cmd
./gradlew clean azureFunctionsRun
```

And visit http://localhost:7071/api/demoAzurefunction

## Deploying the function

To deploy the function run:

```bash
$ ./gradlew clean azureFunctionsDeploy
```


## Feature azure-function documentation

- [Micronaut Azure Function documentation](https://micronaut-projects.github.io/micronaut-azure/latest/guide/index.html#simpleAzureFunctions)

- [https://docs.microsoft.com/azure](https://docs.microsoft.com/azure)

