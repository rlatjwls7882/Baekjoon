# [Gold I] Explosive Slabstones Rearrangement

[문제 링크](https://www.acmicpc.net/problem/34588) 

## 문제 설명

<p>Barbara has a garden. The garden can be represented as a $n \times m$ grid. She has placed $k$ slabstones in the garden, so she can enjoy stepping slabstones from one to another every day. The slabstones are indexed from $1$ to $k$. Each slabstone fully occupies some cell of the garden, and no two slabstones are placed at the same cell.</p>

<p>However, an evil person, Babara, is going to place a special device that will occupy a rectangular region in the garden. If any slabstone overlaps with the device, it will explode and destroy the whole garden!</p>

<p>To avoid the explosion, Barbara wants to rearrange the slabstones by shifting the slabstones within the garden. The slabstones should remain non-overlapping <strong>during slabstone rearrangement</strong>. The energy spent is equal to the largest index among all slabstones that have been moved. Now Barbara wants to know the minimum energy required to rearrange the slabstones, so she can save her energy for “other purposes”.</p>

<p>For example, suppose the device will be placed at the blue rectangle. Then Barbara can rearrange the slabstones as follows. Please note that the slabstones do not overlap during the whole process, not only after the rearrangement. All slabstones that have been moved have index at most $4$, so the energy spent is $4$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f921d578-4d0f-43bb-8541-ef43c1fb31f9/-/preview/" style="width: 388px; height: 341px;"></p>

## 입력 

 <p>The first line contains three integers $n$, $m$ and $k$.</p>

<p>Followed by $k$ lines, the $i$-th of which contains two integers $x_i$ and $y_i$, representing that the $i$-th slabstone is located at the $y_i$-th cell of the $x_i$-th row.</p>

<p>The last line contains four integers $u_1$, $v_1$, $u_2$ and $v_2$, representing that the top-left corner of the device is located at the $v_1$-th cell of the $u_1$-th row, and the bottom-right corner of the device is located at the $v_2$-th cell of the $u_2$-th row.</p>

## 출력 

 <p>Print the minimum energy required to rearrange the slabstones. If no slabstones need to be moved, the energy spent is $0$. If the explosion cannot be avoided, just output $-1$.</p>

