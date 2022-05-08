
# personality-test using springboot as backend and react for frontend

In this project h2 in-memory table has been used.Initial values has been provided in personalitymeasure/src/main/resources/data.sql and after mvn clean install and run, tables will be created and ready. There is no need to do enything else about database.
H2 admin console runs on "http://localhost:8080/h2-ui/ "

## Demo
## Category select gif
![](https://github.com/egeliahmet/personality-test/blob/main/category_select.gif)

## Save answers gif
![](https://github.com/egeliahmet/personality-test/blob/main/save_answers.gif)

## Run Locally

Clone the project

```bash
  git clone https://github.com/egeliahmet/personality-test.git
```

For the java server side inport the personality-test/personalitymeasure/ to your IDE
```bash
  mvn clean install
```

For the react server side go to the project directory:

```bash
  cd personality-test/server
```

Install dependencies

```bash
  npm install
```

Start the server

```bash
  npm run server
```
For the react client side go to the project directory:

```bash
  cd personality-test/client
```

Install dependencies

```bash
  npm install
```

Start the client

```bash
  npm start
```



## API Reference

#### Get all categories

```http
  GET api/v1/categories
```


#### Get all questions

```http
  GET api/v1/questions
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `categoryId`      | `long` | **Required**. Id of item to fetch |

#### Save Answers

```http
  GET api/v1/answers/save
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `List<AnswerDto>`      | `AnswerDto` | **Required**. list of AnswerDto object |


