const main = document.querySelector("#main");
const qna = document.querySelector("#question");
const result = document.querySelector("#result");
const end = 10; 
const select = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0];

function start(){  //시작하면 질문 등장
  $("#main").fadeOut("slow");
  $("#main").hide();
  $("#question").fadeIn("slow");
  let qNum = 0;
  next(qNum);
}

function next(qNum){ 
  //마지막 질문이면 결과로 
  if(qNum === end){
    goResult();
    return;
  }
  var q = document.querySelector('.q_box');
  q.innerHTML = list[qNum].q;
  
  for(let i in list[qNum].a){
    addAnswer(list[qNum].a[i].answer, qNum, i);
  }
  var status = document.querySelector('.status_bar');
  //qnum을 0으로 초기화해서 +1 해야함
  status.style.width = (100/end) * (qNum+1) + '%';
}

function addAnswer(answerText, qNum, aNum){ //대답 보여주기 
  var a = document.querySelector('.answer_box');
  var answer = document.createElement('button');
  $(".answer_box").fadeIn("fast");
  answer.classList.add('answerList');


  a.appendChild(answer);
  answer.innerHTML = answerText;

  answer.addEventListener("click", function(){
    var aList = document.querySelectorAll('.answerList');
    $(".answer_box").fadeOut("fast");

    var target = list[qNum].a[aNum].type;
    for(let i = 0; i < target.length; i++){
      select[target[i]] += 1;//책 넘버 카운트
    }

    for(let i = 0; i < aList.length; i++){
      aList[i].style.display = 'none';
    }
    next(++qNum);
  })
}
function goResult(){ 

  $("#question").fadeOut("slow");
  $("#question").hide();
  $("#result").fadeIn("slow");
  setResult();
}
function setResult(){
  let point = cal();
  //name
  const resultName = document.querySelector('.result_name');
  resultName.innerHTML = infoList[point].name;
//i 에 맞는 이미지 삽입
  var img = document.createElement('img');
  const imgDiv = document.querySelector('#result_img');
  var url = '../static/images/rec-' + point + '.png';
  img.src = url;
  img.alt = point;
  img.classList.add('img-fluid');
  imgDiv.appendChild(img);
//desc
  const resultDesc = document.querySelector('.result_desc');
  resultDesc.innerHTML = infoList[point].desc;
}
function cal(){
  console.log(select); //리스트 확인용
  var result = select.indexOf(Math.max(...select));
  return result;
}



















