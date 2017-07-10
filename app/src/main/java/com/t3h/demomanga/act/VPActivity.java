package com.t3h.demomanga.act;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.t3h.demomanga.R;
import com.t3h.demomanga.adapter.VPStoryAdapter;
import com.t3h.demomanga.item.ItemStory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NamNv on 13/04/2017.
 */

public class VPActivity extends AppCompatActivity implements VPStoryAdapter.IFXStrory {
    private ViewPager vpFace;
    private VPStoryAdapter mAdapter;
    ItemStory itemX;
    private List<ItemStory> mItemStories;
    int pos;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mItemStories = new ArrayList<>();
        initDatas();
        initViews();

    }

    private void initDatas() {
        mItemStories.add(new ItemStory("Lọ thuốc của Vova", "Bố đi làm về thấy Vova đang đóng đinh xuống đất. “Tại sao con lại đóng đinh xuống đất?” bố tò mò hỏi.\n" +
                "\n" +
                "Vova chìa cho bố xem một chiếc lọ thí nghiệm, nói: “Đây không phải là đinh. Con thử điều chế một ít thuốc cải tử hoàn sinh theo cuốn sách cũ trong tủ. Đây là thí nghiệm trên một con giun đã chết. Con giun không sống lại được nhng không hiểu sao nó lại trở nên rất cứng.”\n" +
                "\n" +
                "“Con cho bố lọ thuốc với công thức điều chế, bố sẽ mua cho con một Toyota.”\n" +
                " Hôm sau đi học về, Vova thấy bó mẹ rất vui và còn nói đã mua một chiếc Mecedes mới cứng trước cửa. Nó lạ quá hỏi bố. Bố trả lời: “Chiếc Toyota bố mua cho con để trong ga-ra. Còn chiếc Mecedes trước cửa là mẹ tặng con đấy.”\n"));

        mItemStories.add(new ItemStory("Quà tặng âm nhạc của Vova", "Một hôm Vova đi chơi và nhặt đươc 1 chiếc ví, Vova liền gọi điện đến chương trình Quà tặng âm nhạc trực tiếp:\n" +
                "\n" +
                "- Thưa quý đài, hôm qua tôi nhặt được một chiếc ví, trong đó có 50 triệu đồng tiền mặt.\n" +
                " Phát thanh viên nhỏ nhẹ:  Thế bây giờ chúng tôi có thể giúp gì cho bạn đây?\n" +
                " - Ngoài ra, trong ví còn có một tấm danh thiếp mang tên tuổi và địa chỉ của người mất. Tôi muốn tặng cho người có tên và địa chỉ trên một bài hát “Mất thật rồi” kèm theo lời cảm ơn chân thành!\n"));

        mItemStories.add(new ItemStory("Vova đi giảng đạo", "Lớn lên, Vova quyết định không chọn nghề bác sĩ trị rối loạn tình dục nữa mà đi theo nghề… giảng đạo. Buổi đầu tiên đi giảng, Vova hỏi:\n" +
                " - Hỡi các con, các con có biết hôm nay ta giảng gì không?\n" +
                " - Dạ không ạ! – toàn thể các con trả lời.\n" +
                " - Thế nếu các con chưa biết gì cả về cái ta sẽ giảng thì ta giảng cũng vô ích!\n" +
                " Nói đoạn quay ra đi về thẳng.\n" +
                "\n" +
                "Ngày hôm sau, Vova lại hỏi tiếp như hôm trước. Toàn thể đồng thanh:\n" +
                " - Có!\n" +
                " - Nếu các con đã biết hết rồi thì ta giảng cũng bằng thừa!\n" +
                " Xong lại đi về tiếp.\n" +
                "\n" +
                "Ngày thứ ba, Vova lại hỏi như hai ngày trước. Rút kinh nghiệm, lần này các con chia nhau một nửa trả lời không, một nửa trả lời có.\n" +
                " - Vậy thì những ai đã biết sẽ dạy cho ai chưa biết! – Vova trả lời, và lại cắp đít ra về.\n"));

        mItemStories.add(new ItemStory("Quần sịp", "Cô giáo hỏi Vova:\n" +
                "\n" +
                "- Tại sao hôm qua em không đi học?\n" +
                " Vova giải thích:\n" +
                " - Hôm qua mẹ em giặt mất cái quần sịp của em, mà em thì chỉ có mỗi một cái đó.\n" +
                " Cô giáo:\n" +
                " - Được rồi.\n" +
                " Ngày hôm sau cũng không thấy Vova đến trường. Cô giáo hỏi:\n" +
                " - Mẹ em lại giặt mất quần sịp của em à?\n" +
                " Vova:\n" +
                " - Thưa cô không phải, việc gì phải giặt nó hàng ngày. Trên đường em tới trường, đi ngang qua nhà cô ……. và em thấy quần … của cô treo trên ban công, thế là em nghĩ: tới trường làm gì khi mà cô không có ở đó.\n"));

        mItemStories.add(new ItemStory("Xác nhận vấn đề", "Vova thường ngồi chung xe bus với Natasa. Một hôm, Vova lấy hết dũng cảm dúi cho Natasa một mẩu giấy, trên đấy viết:\n" +
                "\n" +
                "- \"Tôi rất thích bạn, nếu bạn đồng ý kết bạn với tôi thì hãy đưa lại mẩu giấy này cho tôi, còn nếu không đồng ý thì hãy vứt nó qua cửa sổ\".\n" +
                "\n" +
                "- Một lúc sau Natasa chuyển lại mẩu giấy cũ, Vova vui mừng mở ra xem, trên giấy viết: \"Không mở được cửa sổ!\"\n"));

        mItemStories.add(new ItemStory("Bạn gái Vova", "Vova có người yêu và cảm thấy bực mình khi nàng hay làm phiền mình,\n" +
                "\n" +
                "Môt hôm nhận được tin nhắn:\n" +
                " “Khi anh ngủ, hãy gửi cho em những giấc mơ.\n" +
                " Khi anh vui, hãy gửi cho em những nụ cười.\n" +
                " Khi anh khóc, hãy gửi cho em những giọt nước mắt.”\n" +
                " Vova liền gửi lại:\n" +
                " “Anh đang ỉa. Có cần anh gửi cho em cái gì không??? ”\n"));

        mItemStories.add(new ItemStory("Vinh danh cho đất nước", "Lần đầu tiên NASA (Cơ quan hàng không vũ trụ Mỹ) đưa người lên không gian, họ phát hiện ra rằng bút bi không thể viết được trong môi trường phi trọng lực.\n" +
                " Để khắc phục vấn đề này, NASA đã thành lập một nhóm nghiên cứu sản xuất loại bút có thể dùng trong tình trạng không trọng lượng, có thể viết ngược xuôi tùy ý trên hầu hết mọi bề mặt làm việc ở bất kỳ nhiệt độ nào. Chương trình kéo dài 3 năm và ngốn mất một ngân khoản 7 triệu USD.\n" +
                " Trong khi đó, Vova là cậu bé người Nga đã chọn cách đơn giản đánh bại mọi cách đó là dùng bút chì và được vinh danh cho cả nước Nga."));

        mItemStories.add(new ItemStory("Vova và một giấc mơ", "Content"));

        mItemStories.add(new ItemStory("oto vào gara", "Content"));

        mItemStories.add(new ItemStory("Vova khó ngủ", "Content"));
        mItemStories.add(new ItemStory("Vova và trò chơi người lớn", "Content"));
        mItemStories.add(new ItemStory("Sổ liên lạc", "Content"));
        mItemStories.add(new ItemStory("Đi tham quan công trường", "Content"));
        mItemStories.add(new ItemStory("Không đẻ được", "Content"));
    }


    private void initViews() {
        vpFace = (ViewPager) findViewById(R.id.content);
        mAdapter = new VPStoryAdapter(this);
        vpFace.setAdapter(mAdapter);
    }


    @Override
    public int getCountX() {
        return mItemStories.size();
    }

    @Override
    public ItemStory getItemStoryX(int position) {
        return mItemStories.get(position);
    }
}
