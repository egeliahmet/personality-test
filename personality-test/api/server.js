const express=require('express');
const dotenv= require('dotenv');
const cors=require('cors');
const {json}=require("body-parser");
const axios=require('axios');

const app=express();

app.use(cors());
app.use(json());

const BASE_URL_CATEGORIES=`http://localhost:8080/api/v1/categories/`;
const BASE_URL_QUESTIONS=`http://localhost:8080/api/v1/questions`;
const BASE_URL_SAVE_ANSWERS=`http://localhost:8080/api/v1/answers/save`;

app.get('/categories',async (req,res)=>{
    

    const response =await axios.get(BASE_URL_CATEGORIES);

    return res.send(response.data)
});

app.get('/questions',async (req,res)=>{
    

    const response =await axios.get(BASE_URL_QUESTIONS,
        {
            params:{
                categoryId:req.query.categoryId,
            }
        }, );

    return res.send(response.data)
});

app.post('/answers/save',async (req,res)=>{
    
   console.log(req.body);
    const response =await axios.post(BASE_URL_SAVE_ANSWERS, req.body);

    return res.send(response.data)
});

const PORT= 7000;
app.listen(PORT,console.log(`server is running on port ${PORT}`));