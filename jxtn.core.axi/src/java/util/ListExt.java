/*
 * This is free and unencumbered software released into the public domain.
 *
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 *
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, please refer to <http://unlicense.org/>
 */

package java.util;

import java.util.function.Predicate;

/**
 * {@link List}的延伸功能
 *
 * @author AqD
 * @param <E> 清單項目型態
 */
public interface ListExt<E> extends CollectionExt<E>
{
    /**
     * 以{@link Collection}型態表示
     *
     * @return 以{@link Collection}型態表示的目前物件
     */
    default Collection<E> asCollection()
    {
        List<E> thiz = (List<E>) this;
        return thiz;
    }

    /**
     * 取得第一筆項目
     *
     * @return 第一筆項目。
     * @throws NoSuchElementException 沒有項目
     */
    @Override
    default E first()
    {
        List<E> thiz = (List<E>) this;
        if (thiz.size() == 0)
            throw new NoSuchElementException();
        else
            return thiz.get(0);
    }

    /**
     * 取得第一筆項目
     *
     * @return 第一筆項目，或null表示沒有項目
     */
    @Override
    default E firstOrNull()
    {
        List<E> thiz = (List<E>) this;
        if (thiz.size() == 0)
            return null;
        else
            return thiz.get(0);
    }

    /**
     * 取得符合指定條件的第一個項目索引
     *
     * @param filter 測試條件的函數
     * @return 符合{@code filter}的第一個項目索引，或-1表示找不到
     */
    default int firstIndexOf(Predicate<E> filter)
    {
        List<E> thiz = (List<E>) this;
        for (int i = 0; i < thiz.size(); i++)
        {
            E e = thiz.get(i);
            if (filter.test(e))
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * 取得最後一筆項目
     *
     * @return 最後一筆項目。
     * @throws NoSuchElementException 沒有項目
     */
    default E last()
    {
        List<E> thiz = (List<E>) this;
        if (thiz.size() == 0)
            throw new NoSuchElementException();
        else
            return thiz.get(thiz.size() - 1);
    }

    /**
     * 取得最後一筆項目
     *
     * @return 最後一筆項目，或null表示沒有項目
     */
    default E lastOrNull()
    {
        List<E> thiz = (List<E>) this;
        if (thiz.size() == 0)
            return null;
        else
            return thiz.get(thiz.size() - 1);
    }
}