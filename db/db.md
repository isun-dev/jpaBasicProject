## docker pull postgresql

```shell
docker pull postgres
```

## docker start postgresql

```shell
docker run --name postgresql -e POSTGRES_PASSWORD=123456 -p 5432:5432 -d postgres
```

## docker check postgresql 

```shell
docker ps | grep postgresql
```

## docker postgresql container start 

```shell
docker start postgresql
```

## docker postgresql contaier stop

```shell
docker stop postgresql
```