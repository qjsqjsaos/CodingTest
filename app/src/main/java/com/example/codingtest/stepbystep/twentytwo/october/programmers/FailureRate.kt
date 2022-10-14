package com.example.codingtest.stepbystep.twentytwo.october.programmers

//실패율
class FailureRate {
    fun solution(N: Int, stages: IntArray): IntArray {

        val result: IntArray

        //실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수(notCleardLength) / 스테이지에 도달한 플레이어 수 cleardLength

        //스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
        var notCleardLength: Int

        //스테이지에 도달한 플레이어 수, 처음은 스테이지 사이즈가 기본 값(전체 문제)
        //소수점 비교를 위해 float 사용
        var cleardLength = stages.size.toFloat()

        //결과 담을 map 만들어주기 //사이즈 초깃값 넣기
        val fRMap = HashMap<Int, Float>()


        (1..N).forEach { cl ->
            //스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수를 구하고,
            notCleardLength = stages.count { stage -> cl == stage }

            // 실패율 구하기
            // 소수점을 비교하기 위해 Float을 사용하고,
            // 소수점 아래 4번째까지 반올림을 하여, 무한으로 나누어져버려 overflow가 생기는 것 방지 ex) pi
            val failureRate = if (notCleardLength != 0) notCleardLength / cleardLength else 0f

            //실패율 맵에 넣어주기
            fRMap[cl] = failureRate

            //스테이지에 도달한 플레이어 수 갱신해주기
            //cleardLength에서 notCleardLength를 빼주어야한다.
            cleardLength -= notCleardLength
        }
        //이제 실패율을 담은 맵을 리스트로 변환후 실패율로 내림차순 정렬뒤 스테이지의 종류를 따로 맵핑하여, intArray로 변환해줍니다.
        result = fRMap.toList().sortedByDescending { it.second }.map { it.first }.toIntArray()

        return result
    }
}