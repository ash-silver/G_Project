/*
트로피컬-0
불편 -1
해방 -2
하얼빈-3
달러구트-4
소년이온다-5ㄴ
홍학의자리-6
달의아이-7
한아뿐-8
아몬드-9
유괴의 날-10
칵테일-11
메리 골드 -12
내가 빠진 로맨스 - 13
모비 딕 - 14

*/


const list = [
    {
        q: '로맨스 소설을 좋아하시나요?',
        a: [
          { answer: 'Yes', type: [8,12,13] },
          { answer: 'No', type: [1,2,3,4,5,6,7,9,10,11,0,14] }
        ]
      },
      {
        q: '스릴러, 추리 장르의 책을 좋아하시나요?',
        a: [
          { answer: 'Yes', type: [6, 10,11,0] },
          { answer: 'No', type: [ 1,2,3,4,5,7,8,9,12,13,14] }

        ]
      },
      {
        q: '감동을 주는 스토리를 좋아하시나요?',
        a: [
          { answer: 'Yes', type: [2, 3, 5, 7, 9,14] },
          { answer: 'No', type: [1,4,6,8,10,11,0,12,13] }
        ]
    },
    {
        q: '해학/풍자 소설을 좋아하시나요?',
        a: [
          { answer: 'Yes', type: [1,14] },
          { answer: 'No', type: [2,3,4,5,6,7,8,9,10,11,0,12,13] }
        ]
    },
    {
        q: '판타지 소설을 좋아하시나요?',
        a: [
          { answer: 'Yes', type: [4, 7,12,14 ] },
          { answer: 'No', type: [1,2,3,5,6,8,9,10,11,0,13 ] }
        ]
    },
    {
      q: '역사를 배경으로 한 책을 좋아하시나요?',
      a: [
        { answer: 'Yes', type: [3, 5] },
        { answer: 'No', type: [1,2,4,6,7,8,9,10,11,0,12,13,14 ] }
      ]
    },
    {
      q: '해피엔딩 vs 새드엔딩',
      a: [
        { answer: '역시 엔딩은 해피엔딩이지!', type: [1,2, 4, 7, 8, 9, 10,11,0,12,13] },
        { answer: '오늘은 슬픈 여운이 남는 책이 좋은걸?', type: [3, 5] }
      ]
    },

    {
      q: '열린 결말을 좋아하시나요?',
      a: [
        { answer: 'Yes', type: [6,14 ] },
        { answer: 'No', type: [1,2,3,4,5,7,8,9,10,11,0,12,13]}
      ]
    },
    {
      q: '강한 반전이 있는 책을 좋아하시나요?',
      a: [
        { answer: 'Yes', type: [1, 4, 5, 6, 9, 10,0,13] },
        { answer: 'No', type: [2, 3,7,8,11,12,14] },
      ]
    },
    {
      q: '어떤 책 표지를 좋아하시나요?',
      a: [
        { answer: '예쁘고 아기자기한 표지가 좋아!', type: [0,1, 4, 7, 10,11,12,13] },
        { answer: '깔끔하게 주제와 맞는 표지가 좋아!', type: [2,3,5,6,8,9,14] }
      ]
    },

  ]

  const infoList = [
    {
      name: '트로피컬 나이트',
      desc: '괴물, 유령, 외계 생명과 인간이 함께 살아가는 생동하는 세계, 그곳에는 서늘한 공포 아래 온기가, 절망 곁에 희망이 있다. 곳곳에서 색색의 마음들이 알알이 터지는 무섭고 사랑스러운 이야기'
      },
    {
      name: '불편한 편의점',
      desc: '서울역에서 살다가 우연한 기회에 편의점에서 일하게 된 한 인물과 저마다의 사연을 안고 편의점을 찾는 이들의 이야기. 그 속에서 지친 하루를 위로하는 편의점의 밤이 열린다.'
    },
    {
      name: '아버지의 해방일기',
      desc: '아버지의 죽음 이후 장례를 치르는 3일간, 오고 가는 사람과 말들 속에 그의 시대가 촘촘하게 얽혀있다. 읽는 동안 울컥, 깊이 맺혀있던 마음들이 토해져 나와 울다가 웃다가 그래서 따뜻해지는 삶의 이야기'
    },
    {
      name: '하얼빈',
      desc: '안중근이 이토 히로부미를 저격한 순간과 그 전후의 시간에 집중해 ‘동양 평화’를 가슴에 품은 청년 안중근, 인간 안중근을 그린다. 기록된 역사 그 너머의 안중근을 바라보게 하는 소설'
    },
    {
      name: '달러구트 꿈 백화점',
      desc: '잠들어야만 입장할 수 있는 상점가 마을, 그 중에서도 가장 인기 있는 곳은 온갖 꿈을 모아 파는 상점가! 그곳에서 벌어지는 비밀스럽고도 가슴 뭉클한 이야기.'
    },
    {
      name: '소년이 온다',
      desc: '1980년 5월 18일부터 열흘간 있었던 광주민주화운동 당시의 상황과 그 이후 남겨진 사람들의 이야기를 철저한 고증과 취재를 바탕으로 담아낸 책.'
    },
    {
      name: '홍학의 자리',
      desc: '소설은 한 남자가 사체를 호수에 유기하는 장면으로 시작한다. 이야기는 장을 거듭하면서 서서히 사건의 진실에 다가가고, 전무후무한 반전과 예측 불가능한 결말의 소설.'
    },
    {
      name: '달의 아이',
      desc: '평범한 일상에 갑자기 불어닥친 재난으로 한순간에 자신들의 가장 소중한 ‘무언가’를 잃고 만 사람들의 이야기를 다룬 감동 판타지 소설'
    },
    {
      name: '지구에서 한아뿐',
      desc: ' 외계인 경민과 저탄소생활을 몸소 실천하는 의류 리폼 디자이너인 한아의 아주 희귀한 종류의 사랑 이야기'
    },
    {
      name: '아몬드',
      desc: '인간을 구성하는 두 가지 위대한 키워드, ‘감정’ 그리고 ‘사랑’. 감정을 느끼지 못하는 독특한 소년의 특별하고 사랑스러운 성장 이야기'
    },
    {
      name: '유괴의 날',
      desc: '유괴를 소재로 했지만 처음부터 마지막까지 유쾌함, 인간의 악의에 대한 오싹한 공포와 예상치 못한 반전의 쾌감을 느끼게 하는 소설'
    },
    {
      name: '칵테일 러브 좀비',
      desc: '블랙 유머를 통해 가부장제의 이면을 들여다보는 오컬트 좀비물의 단편 소설'
      },
    {
      name: '메리골드 마음 세탁소',
      desc: '한밤중 언덕 위에 생겨난, 조금 수상하고도 신비로운 세탁소에서 벌어지는 일들을 그린 힐링 판타지 소설'
      },
    {
      name: '내가 빠진 로맨스',
      desc: '같은 날, 같은 남자에게 바람맞은 세 여자. 세상에 없던 삼중 연애의 끝에 상상도 못 한 기발한 반전이 있는 이야기'
      },
    {
      name: '모비 딕',
      desc: '드넓은 바다에서 펼쳐지는 고래와 인간과의 숨 막히는 싸움을 생생하게 그려낸 이야기'
      },


  ]







// const list = [
//     {
//         q: '로맨스 소설을 좋아하시나요?',
//         a: [
//           { answer: '남녀 주인공의 사랑 스토리가 좋아!', type: [] },
//           { answer: '안그래도 외로운데 무슨 로맨스야..', type: [] },
//         ]
//       },
//     {
//       q: '해피엔딩 vs 새드엔딩',
//       a: [
//         { answer: '역시 엔딩은 해피엔딩이지!', type: [] },
//         { answer: '오늘은 슬픈 여운이 남는 책이 좋은걸?', type: [] },
//       ]
//     },
//     {
//       q: '장편 vs 단편',
//       a: [
//         { answer: '여러 시리즈 or 장수가 많은 책을 읽고 싶어!', type: [ ] },
//         { answer: '한권으로 짧게 끝나는 책이 좋아!', type: [ ] },
//       ]
//     },
//     {
//       q: '열린 결말을 좋아하시나요?',
//       a: [
//         { answer: '독자마다 다르게 해석할 수 있는 열린결말이 좋아!', type: [ ] },
//         { answer: '난 확실한 결말이 있는게 좋아! 열린 결말은 너무 찝찝해..', type: []},
//       ]
//     },

//     {
//         q: '스릴러, 추리 장르의 책을 좋아하시나요?',
//         a: [
//           { answer: '긴장감을 느낄 수 있어서 완전 좋아!', type: [] },
//           { answer: '스릴러장르는 내 스타일이 아니야.', type: [ ] },

//         ]
//       },
//     {
//       q: '역사를 배경으로 한 책을 좋아하시나요?',
//       a: [
//         { answer: '다양한 역사 사건들을 접할 수 있어서 좋아해!', type: [] },
//         { answer: '역사관련 책은 별로 안좋아해!', type: [ ] },
//       ]
//     },
//     {
//       q: '강한 반전이 있는 책을 좋아하시나요?',
//       a: [
//         { answer: '강한 반전 스토리 완전 좋아! ', type: [ ] },
//         { answer: '반전있는 책은 너무 지쳐.. 반전 없는게 좋아.', type: [ ] },
//       ]
//     },

//     {
//       q: '어떤 책 표지를 좋아하시나요?',
//       a: [
//         { answer: '예쁘고 아기자기한 표지가 좋아!', type: [] },
//         { answer: '깔끔하게 주제와 맞는 표지가 좋아!', type: [] },
//       ]
//     },
//     {
//         q: '감동을 주는 스토리를 좋아하시나요?',
//         a: [
//           { answer: '', type: [] },
//           { answer: '', type: [] },
//         ]
//     },
//     // {
//     //     q: '판타지 소설을 좋아하시나요?',
//     //     a: [
//     //       { answer: '', type: [ ] },
//     //       { answer: '', type: [ ] },
//     //     ]
//     // }
//   ]
  