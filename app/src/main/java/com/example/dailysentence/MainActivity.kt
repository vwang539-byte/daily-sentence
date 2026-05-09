package com.example.dailysentence

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class MainActivity : AppCompatActivity() {

    // 시작 날짜: 앱 첫 사용 기준일 (원하면 수정하세요)
    private val startDate = LocalDate.of(2025, 5, 9)

    private val sentences = listOf(
        // Day 1–20: 매우 짧고 단순한 문장
        "I am happy.",
        "She is kind.",
        "He runs fast.",
        "We like cats.",
        "The sky is blue.",
        "I drink water.",
        "She has a dog.",
        "He reads books.",
        "They play soccer.",
        "I wake up early.",
        "She sings well.",
        "He is my friend.",
        "We eat breakfast.",
        "The dog is cute.",
        "I love my family.",
        "She studies hard.",
        "He helps his mom.",
        "We go to school.",
        "The food is good.",
        "I sleep at night.",

        // Day 21–40: 조금 길어지는 문장
        "She always smiles at everyone.",
        "He drinks coffee every morning.",
        "We walk to the park together.",
        "The little cat sleeps on the sofa.",
        "I like to read books at night.",
        "She cooks dinner for her family.",
        "He plays guitar in his free time.",
        "We visit our grandparents on weekends.",
        "The children laugh and play outside.",
        "I write in my diary every day.",
        "She wears a red dress today.",
        "He enjoys watching movies with friends.",
        "We clean the house on Sundays.",
        "The birds sing in the morning.",
        "I take a shower before breakfast.",
        "She brings flowers to her teacher.",
        "He always says thank you politely.",
        "We sit under the big tree.",
        "The baby sleeps in the afternoon.",
        "I feel calm when I listen to music.",

        // Day 41–60: 접속사, 형용사, 부사 추가
        "She is tired, but she keeps working.",
        "He likes summer because it is warm.",
        "We were hungry, so we made sandwiches.",
        "The old man walks slowly in the park.",
        "I want to learn something new every day.",
        "She forgot her umbrella, but she didn't get wet.",
        "He wakes up early and goes for a run.",
        "We played board games and had a great time.",
        "The young girl reads quickly and understands well.",
        "I feel better when I spend time outside.",
        "She called her friend, but no one answered.",
        "He bought a gift and wrapped it carefully.",
        "We talked for hours and never got bored.",
        "The wind was cold, so I wore my coat.",
        "I exercise daily because I want to stay healthy.",
        "She smiled gently and welcomed the new student.",
        "He tried hard, but the problem was too difficult.",
        "We sat by the river and watched the sunset.",
        "The room was quiet, and everyone was focused.",
        "I finished my work and felt very satisfied.",

        // Day 61–80: 관계절, 조건문 등 추가
        "The book that she gave me was really interesting.",
        "If it rains tomorrow, we will stay inside.",
        "He was the person who helped me carry the bags.",
        "When I was young, I loved going to the beach.",
        "The movie that we watched last night was touching.",
        "If you study every day, you will improve quickly.",
        "She wore the scarf that her grandmother knitted for her.",
        "Although it was late, he continued to read his book.",
        "The café where we met is near the old library.",
        "If you need help, please don't hesitate to ask.",
        "She remembered the day when she first learned to ride a bike.",
        "The teacher who explained the lesson was very patient.",
        "Because he practiced every day, he became very skilled.",
        "The park that we visited was full of colorful flowers.",
        "If the weather is nice, let's go for a picnic.",
        "He greeted everyone warmly, even if he was tired.",
        "The letter that arrived this morning was from her old friend.",
        "When she finally understood, she smiled with relief.",
        "The dog that barked loudly was actually very friendly.",
        "If we leave early, we can avoid the heavy traffic.",

        // Day 81–100: 자연스러운 복문 (무리 없는 수준)
        "Although she was nervous, she gave a confident speech in front of the class.",
        "He decided to take a different route because the usual road was under construction.",
        "When the semester ended, all the students gathered to celebrate their hard work.",
        "She packed her bag carefully so that she wouldn't forget anything important.",
        "The restaurant that my family visits every year has recently changed its menu.",
        "If you make a mistake, it is important to admit it and try to do better.",
        "He listened quietly while his friend explained the situation from the beginning.",
        "Because the train was delayed, we had extra time to enjoy coffee at the station.",
        "The photograph that was hanging on the wall reminded her of a happy summer.",
        "When he finally arrived, everyone was relieved and rushed to welcome him.",
        "She kept a journal so that she could remember the small moments of each day.",
        "Although the journey was long, they enjoyed every part of the trip together.",
        "The skills that we learn when we are young often stay with us for a lifetime.",
        "If you listen carefully to others, you will understand them much better.",
        "He was grateful for all the support that his friends had given him over the years.",
        "When the sun set behind the mountains, the whole sky turned shades of orange and pink.",
        "She knew that making a good habit takes time, but she stayed committed every day.",
        "Although the task seemed difficult at first, it became easier as they worked together.",
        "The kindness that people show to strangers can make a bigger difference than we think.",
        "Every day is a chance to learn something new, grow a little, and become a better version of yourself."
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val today = LocalDate.now()
        val dayIndex = ChronoUnit.DAYS.between(startDate, today).toInt()

        val tvDay = findViewById<TextView>(R.id.tvDay)
        val tvSentence = findViewById<TextView>(R.id.tvSentence)
        val tvDate = findViewById<TextView>(R.id.tvDate)

        when {
            dayIndex < 0 -> {
                tvDay.text = "Coming Soon"
                tvSentence.text = "The journey begins on June 1, 2025.\nGet ready!"
                tvDate.text = today.toString()
            }
            dayIndex >= sentences.size -> {
                tvDay.text = "Day ${dayIndex + 1}"
                tvSentence.text = "You've completed all 100 sentences!\nCongratulations! 🎉"
                tvDate.text = today.toString()
            }
            else -> {
                tvDay.text = "Day ${dayIndex + 1}"
                tvSentence.text = sentences[dayIndex]
                tvDate.text = today.toString()
            }
        }
    }
}
