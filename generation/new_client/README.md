# Script to create a new client library module in google-cloud-java monorepo

This tool is for repository maintainers only. Not for library users.

## Prerequisites

Use Linux environment.

Install Docker

### Checkout google-cloud-java repository

```
$ git clone https://github.com/googleapis/google-cloud-java
```


### Install pyenv

Install pyenv

```
curl -L https://github.com/pyenv/pyenv-installer/raw/master/bin/pyenv-installer \
| bash
```

Follow the instruction in the output above to append lines in `$HOME/.bashrc`.
Logout the shell and login again.

Confirm pyenv installation succeeded:

```
suztomo@suztomo:~$ pyenv
pyenv 2.3.4
Usage: pyenv <command> [<args>]

Some useful pyenv commands are:
   activate    Activate virtual environment
   commands    List all available pyenv commands
   deactivate   Deactivate virtual environment
...
```

### Install Python 3.9 via pyenv

```
suztomo@suztomo:~$ pyenv install 3.9.13
Downloading Python-3.9.13.tar.xz...
-> https://www.python.org/ftp/python/3.9.13/Python-3.9.13.tar.xz
Installing Python-3.9.13...
WARNING: The Python sqlite3 extension was not compiled. Missing the SQLite3 lib?
Installed Python-3.9.13 to /usr/local/google/home/suztomo/.pyenv/versions/3.9.13
```

Conform `python3.9` command is available:

```
suztomo@suztomo:~$ which python3.9
/usr/local/google/home/suztomo/.pyenv/shims/python3.9
```

### Install Python packages

At the root of google-cloud-java repository clone, run:

```
$ python3.9 -m pip install -r generation/new_client/requirements.txt
```

## Run client generation script

You will run new-client.py script with the following parameters

### API short name

For convenience of the subsequent commands, define a variable for API short name.
Get the value from the DevRel Services page (Example: `apikeys`):

```
$ API_SHORT_NAME=apikeys
```

### proto path

The script takes "proto path" parameter. This is path from google3's root to the
directory that contains versions (e.g., "v1" or "v2"). For example, if we
have 

> Link to protos: http://google3/google/api/apikeys/v2/apikeys.proto

then the "proto path" value we supply to the command is "google/api/apikeys".

### Name pretty

Pick name from the display name in the DevRel Services site.
For example, "API Keys API" in
https://devrel.corp.google.com/admin/products/479.

### Product Docs

Find product document URL in the DevRel Services site.
For example, "https://cloud.google.com/api-keys/" in
https://devrel.corp.google.com/admin/products/479.

### API description

Find the short description of the API. Usually the first sentence in the product
document above.

### Release level

The first client generation is always "preview".

### Transport

Transport layer. Use "grpc".


### Language

Use "java"

### Monorepo URL

Use "https://github.com/googleapis/google-cloud-java"


### The command example

The script is in generation/new_client.

```
$ cd generation/new_client
$ API_SHORT_NAME=apikeys
$ python3.9 new-client.py generate \
  --api_shortname=${API_SHORT_NAME} \
  --proto-path=google/api/apikeys \
  --name-pretty="API Keys API" \
  --product-docs="https://cloud.google.com/api-keys/" \
  --api-description="API Keys lets you create and manage your API keys for your projects." \
  --release-level=preview \
  --transport=grpc \
  --language=java \
  --monorepo-url="https://github.com/googleapis/google-cloud-java"
```



