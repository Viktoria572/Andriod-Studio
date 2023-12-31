package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieListFragment : Fragment(R.layout.fragment_movie_list) {

    private val movies = listOf(
        Movie("Риф: монстр глибин", "Ендрю Трауки", "Щоб відволіктися від проблем, група молодих дівчат вирушає на екзотичний острів у Тихому океані. Героїні планують зайнятися дайвінгом та поплавати на байдарках, але стикаються зі смертельною небезпекою.\n" +
                "Нік – молода дівчина-дайвер, яка нещодавно пережила жахливу трагедію. Разом зі своєю молодшою сестрою Енні та двома подругами героїня вирішує на кілька днів вирушити на тропічний острів. Ідилічні канікули дівчат швидко перетворюються на справжній кошмар, коли на них починає полювання кровожерна акула. Чи зможуть вони перемогти у сутичці з голодним монстром?", "https://uakino.club/uploads/mini/poster/d1/a14fa2df7475975c329b3e6f55092e.jpg"),
        Movie("Тільки ти","Норман Джуїсон", "Картина Нормана Джуїсона «Тільки ти» (Only you) розповідає нам про Фейт Корвач - просту вчительцку, яка знала ім'я свого судженого, ним був Деймон Бредлі. Цю новину вона носила в собі вже 14 років, їй передбачила це циганка. Минуло багато часу, а чоловік її долі так і не з'явився в її житті. Переставши жити казками і ілюзіями, наша героїня заручається з ортопедом. Однак від долі втекти неможливо, віриш ти в неї чи ні. В один прекрасний день Фейт відповідає на доленосний дзвінок в її житті, це був друг її нареченого, який збирався відвідати Венецію. Представився він як Деймон Бредлі. Корвач, тут же зірвавшись з місця, помчала, забувши про все в аеропорт, назустріч своєму відлетівшому щастю. Фільм змусить вас вмоститися зручніше, розслабитися і повністю зануритися в приємний перегляд. Прекрасна історія двох людей, які були створені одне для одного, долю яких вирішують зовсім не зірки і ворожіння, а вони самі. Відмінна гра акторів і чудовий фінал, який занурить вас у світ романтики і кохання.", "https://uakino.club/uploads/mini/poster/6b/e08d652eb3233babc6a481daeaaafe.jpg"),
        Movie("Залізний орел 2","Сідні Ф'юрі", "Одна з близькосхідних держав загрожує США та смердючому совку міжконтинентальними балістичними ракетами з ядерними боєголовками. Уряди країн створюють об'єднану радянсько-американську бойову групу. Її очолює полковник ВПС США Чарльз \"Чаппі\" Сінклер. Їхнє завдання: усунення небезпеки, але для успішного виконання місії їм належить подолати перешкоди з боку політиків, а також культурні та особистісні протиріччя у своїх лавах. А їх таки багато, бо людям з військовими свинособаками дуже важко знайти спільну мову.", "https://uakino.club/uploads/mini/poster/a5/ddcc08032917a6d5d36ef564f284c0.jpg"),
        Movie("Жага золота", "\n" +
                "Жерар Урі", "Французька кримінальна комедія про суперечку дружини та чоловіка через велику грошову суму. Юрбен Доннадьє (Крістіан Влав'є) щодня крав у компанії, де він працював, 60 тисяч франків. Нагромадивши солідну суму 6 мільярдів франків, він перевів їх у золоті зливки. Чоловік хоче перевезти їх до сусідньої Швейцарії. Розробляється оригінальне рішення: зливки він ховає у цегляній кладці будинку. Доннадьє перевезе через кордон цілий будинок, навряд чи хтось оглядатиме велике житло. Але про плани чоловіка дізнається його дружина Флоретта (Катрін Жакоб). Її обурює той факт, що чоловік не збирався ділитися з нею не дуже чесною нажитою здобиччю. Колись вона, до речі, працювала у податковій поліції. Тому має свої плани на багатство дуже жадібного чоловіка.", "https://uakino.club/uploads/mini/poster/27/abb9d475a9e69e4a70755bb8c72401.jpg"),
        Movie("Минулі життя", "Celine Song", "Юні Hopa і Хе Coн разом йдуть на «побачення» під приглядом матерів. Дітям подобається проводити час і змагатися один з одним, отримуючи кращі оцінки, але сім'я дівчинки вирішує переїхати з Кореї в канадське місто Top. Героїня, що мріє про діяльність письменниці, тому кидає своїх друзів і однокласників, у тому числі засмученого Сона Через 12 років, Hopa, яка вже багато досягла, переїжджає в Нью-Йорк, продовжуючи прокладати кар'єру драматурга. Вона відкриває несподіване повідомлення: Він намагається відновити з нею зв'язок через соціальні мережі. Вони спілкуються за допомогою відеодзвінків, дивуючись, як швидко вони знову знайшли взаєморозуміння, але відстань не дає їм зблизитися. Hовий 12-річний стрибок: тепер героїня заміжня за милим письменником, з яким познайомилися як раз дюжину років назад. Але шкільний приятель знову з'являється на горизонті: він хоче прибути в штати і зустрітися - дівчина не може відмовити.", "https://uakino.club/uploads/mini/poster/82/e585319331918cff2d946d53708d4a.jpg"),
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = MovieAdapter(movies) { selectedMovie ->
            navigateToMovieDetail(selectedMovie)
        }
    }

    private fun navigateToMovieDetail(movie: Movie) {
        val action = MovieListFragmentDirections.actionMovieListFragmentToMovieDetailFragment(movie)
        findNavController().navigate(action)
    }
}